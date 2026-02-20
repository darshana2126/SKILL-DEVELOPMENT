package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class Studentcontroller {

    private List<Student> students = new ArrayList<>();

    // ✅ POST – Add student
    @PostMapping
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        students.add(student);
        return new ResponseEntity<>("Student added successfully", HttpStatus.CREATED);
    }

    // ✅ GET – Get all students
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateEntity(@PathVariable int id, @RequestBody Student updatedStudent) {

        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(student.getName());
                student.setCourse(student.getCourse());

                return ResponseEntity.ok(student);
            }
        }

        return ResponseEntity.notFound().build();
    }
    
    // ✅ DELETE – Delete student
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id) {

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                return new ResponseEntity<>("Student deleted successfully", HttpStatus.OK);
            }
        }

        return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
    }
}