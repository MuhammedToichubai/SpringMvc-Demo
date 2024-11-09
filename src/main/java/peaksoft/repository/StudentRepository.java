package peaksoft.repository;

import peaksoft.entities.Student;

import java.util.List;

public interface StudentRepository {

    // find all
    List<Student> findAll();

    void save(Student student);

}
