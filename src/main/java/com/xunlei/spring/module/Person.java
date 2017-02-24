package com.xunlei.spring.module;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by shiwenhuan on 2017/2/16.
 */
@Data
public class Person implements Serializable {
    private static final long serialVersionUID = 7681359597388478206L;
    private Long id;
    private String name;
    private Integer age;
}
