import java.util.ArrayList;
import java.util.List;

public class CourseBuilder {
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

    public CourseBuilder(String title) {
        this.title = title;
        sections = new ArrayList<>();
        instructors = new ArrayList<>();
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
        instructors.add(instructor);
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

    public Course build() {
        return new Course(courseId, title, enrollCode, instructors, days, times, location, enrolled, maxCapacity, sections);
    }
}
