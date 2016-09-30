package com.myproject.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;

/**
 * Created by Samarth on 9/14/16.
 */


@Entity
@Table(name="helloworld")
public class HelloWorldModel {


    private static final Logger log = LoggerFactory.getLogger(HelloWorldModel.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="hello_id")
    private long id;

    @Column(name="message")
    private String message;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
