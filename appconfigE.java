import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Define a Course bean
    @Bean
    public Course course() {
        return new Course("Java Programming", 6); // Course with name and duration
    }

    // Define a Student bean and inject the Course bean
    @Bean
    public Student student() {
        return new Student("John Doe", course()); // Inject course bean into student
    }
}
