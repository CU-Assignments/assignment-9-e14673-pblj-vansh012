public class Course {
    private String courseName;
    private int duration;

    // Constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Getter methods
    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }
}
