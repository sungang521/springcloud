package com.sungang.type1.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
@Document
@Setter
@Getter
public class Role implements Serializable {
    private static final long serialVersionUID = -6843667995895038741L;
    private Long id;
    @Field("role_name")
    private String roleName  ;
    private String note  ;
}
