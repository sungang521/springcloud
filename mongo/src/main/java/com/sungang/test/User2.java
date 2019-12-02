package com.sungang.test;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "user")
public class User2 {
    private String name;
    private Integer age;
    private String address;
}
