package com.student.controller;

import com.student.dto.StudentDto;
import com.student.model.Student;
import com.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    private Page<StudentDto> getAllStudents(@RequestParam(defaultValue = "0") int page,
                                            @RequestParam(defaultValue = "10") int size)
    {
        return studentService.getStudents( PageRequest.of(page, size));
    }
}
