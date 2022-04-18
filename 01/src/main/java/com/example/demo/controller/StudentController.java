package com.example.demo.controller;

import com.example.demo.controller.model.CreateStudents;
import com.example.demo.controller.model.Student;
import com.example.demo.dto.newStudent;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private List<Student> person;


    public StudentController() {
        person = new LinkedList<>();
        person.add(new Student(1, "Phạm A", 21, "Hà Nội"));
        person.add(new Student(2, "Phạm B", 22, "TPHCM"));
        person.add(new Student(3, "Phạm C", 23, "Sài Gòn"));
        person.add(new Student(4, "Phạm D", 24, "Hài Phòng"));
    }

    @GetMapping
    public List<Student> getStudent() {
        return person;
    }

    @PostMapping
    public Student NewStudents(@RequestBody newStudent newStudent) {
        Student newstudent = new Student(newStudent.id(), newStudent.name(), newStudent.age(), newStudent.address());
        person.add(newstudent);
        return newstudent;

    }
}
