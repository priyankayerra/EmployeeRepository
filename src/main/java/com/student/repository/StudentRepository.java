package com.student.repository;

import com.student.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface StudentRepository  extends JpaRepository<Student,Long> {


      Page<Student> findAll(Pageable pageable);

}
