package com.sungang.day1.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Setter
@Getter
@Document(collection = "student")
public class Student {
    private String name;
    private Integer age;
    private Double score;
}
