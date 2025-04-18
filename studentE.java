public class Student {
    private String name;
    private Course course;

    // Constructor
    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    // Method to print student details
    public void printStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Enrolled Course: " + course.getCourseName());
        System.out.println("Course Duration: " + course.getDuration() + " months");
    }
}
