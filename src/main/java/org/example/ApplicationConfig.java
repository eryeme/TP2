package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public StudentRepository studentRepository() {

        return new InMemoryStudentRepository();
    }
    @Bean
    public StudentService studentService(StudentRepository studentRepository) {
        return new StudentServiceImpl(studentRepository);
    }


    @Bean
    public StudentService studentServiceMock() {
        return new StudentServiceMock();
    }
}
