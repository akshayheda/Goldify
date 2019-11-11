import java.util.List;

public class Course {
    private String courseId;
    private String title;
    private String enrollCode;
    private String instructor;
    private String days;
    private String times;
    private String location;
    private int enrolled;
    private int maxCapacity;
    private List<Course> sections;
    private Course lecture;

    public Course(String courseId, String title, String enrollCode, String instructor, String days, String times, String location, int enrolled, int maxCapacity, List<Course> sections, Course lecture) {
        this.courseId = courseId;
        this.title = title;
        this.enrollCode = enrollCode;
        this.instructor = instructor;
        this.days = days;
        this.times = times;
        this.location = location;
        this.enrolled = enrolled;
        this.maxCapacity = maxCapacity;
        this.sections = sections;
        this.lecture = lecture;
    }

    public void addSection(Course section) {
        this.sections.add(section);
    }

    public void setLecture(Course lecture) {
        this.lecture = lecture;
    }

    public String toString() {
        String result = courseId + " " + title + " " + enrollCode + " " + instructor + " " + days + " " + times + " " + location + " " + enrolled + "/" + maxCapacity;
        for (Course section : sections) {
            result += "\n    " + section.toString();
        }
        return result;
    }
}
