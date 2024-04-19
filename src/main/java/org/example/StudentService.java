package org.example;

public interface StudentService {
    void createStudent(Student student);
    Student getStudentById(Integer id);
    void displayAllStudents();
}
