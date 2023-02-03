package com.student.service;

import com.student.dto.StudentDto;
import com.student.model.Student;
import com.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Page<StudentDto> getStudents(Pageable pageable) {
        Page<Student> students = studentRepository.findAll(pageable);
        return students.map(this::convertStudentToStudentDto);
    }

    private StudentDto convertStudentToStudentDto(Student student) {
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setTelugu(student.getTelugu());
        studentDto.setEnglish(student.getEnglish());
        studentDto.setMaths(student.getMaths());
        studentDto.setScience(student.getScience());
        studentDto.setSocial(student.getSocial());
        studentDto.setTotal(student.getEnglish() + student.getTelugu() + student.getMaths() + student.getScience() + student.getSocial());
        return studentDto;
    }
}
