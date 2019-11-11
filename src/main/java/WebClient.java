import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class WebClient {
    private static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        parse(getAspxWebpage(Department.CMPSC.getCode(), Quarter.FALL_19.getCode()));
    }

    public static String getAspxWebpage(String department, String quarter) {
        CloseableHttpClient client = HttpClients.custom().build();

        HttpPost post = new HttpPost(DefaultValues.SCHEDULE_URL);
        for(Map.Entry<String, String> header : DefaultValues.HEADERS.entrySet()) {
            post.addHeader(header.getKey(), header.getValue());
        }

//        Jsoup.connect(DefaultValues.SCHEDULE_URL).followRedirects(true).request().removeHeader("User-Agent");

        List<NameValuePair> formData = new ArrayList<>();
        for(Map.Entry<String, String> field : DefaultValues.X_FORM_ENCODED.entrySet()) {
            formData.add(new BasicNameValuePair(field.getKey(), field.getValue()));
        }
        formData.add(new BasicNameValuePair(DefaultValues.DEPARTMENT_FIELD, department));
        formData.add(new BasicNameValuePair(DefaultValues.QUARTER_FIELD, quarter));
        try {
            post.setEntity(new UrlEncodedFormEntity(formData, "UTF-8" ));
            CloseableHttpResponse response = client.execute(post);
            System.out.println(response.getStatusLine().getStatusCode());
            //parse output into string
            return new BasicResponseHandler().handleResponse(response);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Unable to make HTTP Request for scraping, caught err" + e);
        }
        return null;
    }

    public static void parse(String webpage) {
        Document document = Jsoup.parse(webpage);
        Elements courseRows = document.select("tr.CourseInfoRow");
        List<Course> courses = new ArrayList<>();
        Course previousLecture = null;
        for (Element row : courseRows) {
            String courseId = row.child(1).ownText();
            boolean isLecture = Boolean.parseBoolean(row.child(10).text());
            String fullState = row.child(3).text();
            String enrollCode = row.child(4).child(0).text();
            String title = row.child(2).text();
            String spots = row.child(9).text();
            String location = row.child(8).text();
            String time = row.child(7).text();
            String day = row.child(6).text();
            String professor = row.child(5).text();
            int maxCapacity = Integer.parseInt(spots.substring(spots.indexOf("/") + 2));
            int enrolled = Integer.parseInt(spots.substring(0, spots.indexOf("/") - 1));
//            System.out.println("course id: " + row.child(1).ownText());
//            System.out.println("full/cancelled: " + row.child(3).text());
//            System.out.println("enroll code: " + row.child(4).child(0).text());
//            System.out.println("full title: " + row.child(2).text());
//            System.out.println("lecture?: " + row.child(10).text());
//            System.out.println("spots: " + row.child(9).text());
//            System.out.println("location: " + row.child(8).text());
//            System.out.println("time: " + row.child(7).text());
//            System.out.println("day: " + row.child(6).text());
//            System.out.println("professor: " + row.child(5).text());
//            System.out.println("maxCapacity: " + maxCapacity);
//            System.out.println("enrolled: " + enrolled);
//            System.out.println("-------");

            Course course = new CourseBuilder(title).setCourseId(courseId).setEnrollCode(enrollCode).setLocation(location).setTimes(time).setDays(day).setInstructor(professor).setMaxCapacity(maxCapacity).setEnrolled(enrolled).build();
            if (isLecture) {
                courses.add(course);
                previousLecture = course;
            } else if (previousLecture != null) {
                previousLecture.addSection(course);
                course.setLecture(previousLecture);
            }

        }

        for (Course course : courses) {
            System.out.println(course);
        }

    }
}
