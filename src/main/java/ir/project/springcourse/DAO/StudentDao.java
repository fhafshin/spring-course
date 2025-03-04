package ir.project.springcourse.DAO;

import ir.project.springcourse.entity.Student;
import org.springframework.web.servlet.support.JstlUtils;

import java.util.List;

public interface StudentDao {

    void save(Student student);

    Student findById(int id);


    List<Student> findAll(String name);

    Student findByName(String name);
}
