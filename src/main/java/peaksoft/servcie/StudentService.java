package peaksoft.servcie;

import peaksoft.entities.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    void save(Student student);
}
