import java.util.List;

public class Course {
    private String courseId;
    private String title;
    private String enrollCode;
    private List<String> instructors;
    private String days;
    private String times;
    private String location;
    private int enrolled;
    private int maxCapacity;
    private List<Course> sections;

    public Course(String courseId, String title, String enrollCode, List<String> instructors, String days, String times, String location, int enrolled, int maxCapacity, List<Course> sections) {
        this.courseId = courseId;
        this.title = title;
        this.enrollCode = enrollCode;
        this.instructors = instructors;
        this.days = days;
        this.times = times;
        this.location = location;
        this.enrolled = enrolled;
        this.maxCapacity = maxCapacity;
        this.sections = sections;
    }
}
