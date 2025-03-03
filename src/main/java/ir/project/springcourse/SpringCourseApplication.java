package ir.project.springcourse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"ir.project.springcourse","ir.project.two"})
public class SpringCourseApplication  {

    public static void main(String[] args) {
        SpringApplication.run(SpringCourseApplication.class, args);
    }

@Bean
    public CommandLineRunner commandLineRunner() {

        return runner->{
            System.out.println("hello world");
        };
}
}
