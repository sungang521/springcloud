package com.sungang.day1.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Setter
@Getter
public class A {
    @NotNull(message = "name can not be null")
    private String name;
}
