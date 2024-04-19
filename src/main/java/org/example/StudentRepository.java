package org.example;

import java.util.List;

public interface StudentRepository {
    void save(Student student);
    Student findById(Integer id);
    List<Student> findAll();
}
