package ir.project.springcourse;

import ir.project.springcourse.DAO.StudentDao;
import ir.project.springcourse.entity.Student;
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
    public CommandLineRunner commandLineRunner(StudentDao studentDao) {

        return runner->{
            createStudent(studentDao);
        };
}

    private void createStudent(StudentDao studentDao) {
        Student student = new Student("hesam","hasani","tr@fg.com");
        studentDao.save(student);

    }
}
