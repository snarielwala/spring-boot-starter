package com.myproject.services;

import com.myproject.dto.HelloWorldDto;
import com.myproject.models.HelloWorldModel;
import com.myproject.repositories.HelloWorldRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Samarth on 9/20/16.
 */

/*
  Service classes are annotated with the @Service Notation
  Service methods contain the business logic and all the interactions with
  database. This is method corresponding to the GET /helloworld
     */
@Service
@Qualifier("helloWorldService")
public class HelloWorldService {

    //The @Resource Annotation allows you to inject dependencies in your classes
    @Resource
    private HelloWorldRepository helloWorldRepository;

    private static final Logger log = LoggerFactory.getLogger(HelloWorldService.class);


    //Service method corresponding to the get request retrieving a new entity from the database
    public HelloWorldDto getHelloWorld(Long id){

        HelloWorldModel model = helloWorldRepository.findOne(id);
        HelloWorldDto response = new HelloWorldDto();
        response.setMessage(model.getMessage());
        response.setId(model.getId());
        return response;
    }

    //Service method corresponding to the post request adding a new entity to the database
    public HelloWorldDto  postHelloWorld(HelloWorldDto helloWorldDto){

        HelloWorldModel newModel = new HelloWorldModel();
        newModel.setMessage(helloWorldDto.getMessage());
        helloWorldRepository.saveAndFlush(newModel);

        return helloWorldDto;

    }

    //Service method corresponding to the delete request deleting an entity from the databse
    public void deleteHelloWorld(Long id){

        helloWorldRepository.delete(id);
    }
}
