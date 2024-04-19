package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        StudentService studentService = context.getBean(StudentService.class);

        Student student1 = new Student(1, "Alice", 20);
        Student student2 = new Student(2, "Bob", 19);

        studentService.createStudent(student1);
        studentService.createStudent(student2);

        studentService.displayAllStudents();

        Student studentById = studentService.getStudentById(1);
        System.out.println("Student found by ID: " + studentById.getName());
    }
}