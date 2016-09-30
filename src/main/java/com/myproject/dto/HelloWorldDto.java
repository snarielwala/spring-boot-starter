package com.myproject.dto;

/**
 * Created by Samarth on 9/14/16.
 */
/*
    DTOs are used to exchange data with your client
    DTOs can process data from multiple entities and present it to the client in the format they want
    DTOs are like wrappers or an abstraction layer around the database models/entity classes
 */
public class HelloWorldDto {

    private Long id;
    private String message;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
