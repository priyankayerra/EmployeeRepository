package com.student.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class StudentDto {

    private Long id;


    private String name;


    private Long telugu;


    private Long english;


    private Long maths;


    private Long science;

    private Long social;

    private Long total;

}
