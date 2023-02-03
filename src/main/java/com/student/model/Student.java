package com.student.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="student")
@NamedQuery(name = "Student.findAll", query = "SELECT a FROM Student  a")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name = "telugu")
    private Long telugu;

    @Column(name = "english")
    private Long english;

    @Column(name = "maths")
    private Long maths;

    @Column(name = "science")
    private Long science;

    @Column(name = "social")
    private Long social;


}
