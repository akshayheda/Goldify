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


public class WebClient {
    private static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) {
        System.out.println(getAspxWebpage());
    }
    

    public static String getAspxWebpage() {
        CloseableHttpClient client = HttpClients.custom().build();

        HttpPost post = new HttpPost(DefaultValues.SCHEDULE_URL);
        for(Map.Entry<String, String> header : DefaultValues.HEADERS.entrySet()) {
            post.addHeader(header.getKey(), header.getValue());
        }

        List<NameValuePair> formData = new ArrayList<>();
        for(Map.Entry<String, String> field : DefaultValues.X_FORM_ENCODED.entrySet()) {
            formData.add(new BasicNameValuePair(field.getKey(), field.getValue()));
        }
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
}
