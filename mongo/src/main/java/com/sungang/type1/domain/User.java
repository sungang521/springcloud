package com.sungang.type1.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.List;

@Document(collection = "user")
@Getter
@Setter
public class User implements Serializable {
    @Id
    private Long id =1l;
    @Field("user_name")
    private String userName;
    @Field
    private String note;
    @Field
    private List<Role> roles;
}
