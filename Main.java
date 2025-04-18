import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Load the Spring context from the configuration class (AppConfig)
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the Student bean from the Spring container
        Student student = context.getBean(Student.class);

        // Print student details
        student.printStudentDetails();

        // Close the context
        context.close();
    }
}
