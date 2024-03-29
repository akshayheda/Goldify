import java.util.ArrayList;
import java.util.List;

public class CourseBuilder {
    private String courseId;
    private String title;
    private String enrollCode;
    private String instructor;
    private String days;
    private String times;
    private String location;
    private int enrolled;
    private int maxCapacity;
    private Course lecture;
    private List<Course> sections;

    public CourseBuilder(String title) {
        this.title = title;
        sections = new ArrayList<>();
    }

    public CourseBuilder setCourseId(String courseId) {
        this.courseId = courseId;
        return this;
    }

    public CourseBuilder setEnrollCode(String enrollCode) {
        this.enrollCode = enrollCode;
        return this;
    }

    public CourseBuilder setInstructor(String instructor) {
        this.instructor = instructor;
        return this;
    }

    public CourseBuilder setDays(String days) {
        this.days = days;
        return this;
    }

    public CourseBuilder setTimes(String times) {
        this.times = times;
        return this;
    }

    public CourseBuilder setLocation(String location) {
        this.location = location;
        return this;
    }

    public CourseBuilder setEnrolled(int enrolled) {
        this.enrolled = enrolled;
        return this;
    }

    public CourseBuilder setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    public CourseBuilder addSection(Course section) {
        sections.add(section);
        return this;
    }

    public CourseBuilder addLecture(Course lecture) {
        this.lecture = lecture;
        return this;
    }

    public Course build() {
        return new Course(courseId, title, enrollCode, instructor, days, times, location, enrolled, maxCapacity, sections, lecture);
    }
}
