package com.myproject.controllers;

import com.myproject.dto.HelloWorldDto;
import com.myproject.models.HelloWorldModel;
import com.myproject.repositories.HelloWorldRepository;
import com.myproject.services.HelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import utils.Constants;

import javax.annotation.Resource;

/**
 * Created by Samarth on 9/14/16.
 */

/*
This class is an example of a controller class for your REST APIs
Every incoming request is mapped to a particular controller's method
 */
@RestController
@RequestMapping(value = Constants.API_BASE_URL + "helloworld")
public class HelloWorldController {

    @Resource
    HelloWorldService helloWorldService;

    private static final Logger log = LoggerFactory.getLogger(HelloWorldController.class);

    /*
     Example GET Request method for a controller
     The Request Mapping annotation allows you to map this method to a request URL
     It also allows you to specify which HTTP Request Method is permitted
     Request Parameter is in the URL as a URL Parameter.
     All the business logic around every method in the controller should be abstracted
     out in the appropriate service classes.
     */
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public HelloWorldDto getOffer(@RequestParam Long id) {
        return helloWorldService.getHelloWorld(id);
    }

    /*
    Example POST Request method for a controller
    The Request Mapping annotation allows you to map this method to a request URL
    It also allows you to specify which HTTP Request Method is permitted
    Incoming request body is parsed into the DTO
    All the business logic around every method in the controller should be abstracted
    out in the appropriate service classes.
    */
    @RequestMapping(value = "/helloworld", method = RequestMethod.POST)
    public HelloWorldDto postOffer(@RequestBody HelloWorldDto helloWorldDto) {

        return helloWorldService.postHelloWorld(helloWorldDto);
    }

    /*
   Example DELETE Request method for a controller
   The Request Mapping annotation allows you to map this method to a request URL
   It also allows you to specify which HTTP Request Method is permitted
   Incoming request body is parsed into the DTO
   All the business logic around every method in the controller should be abstracted
   out in the appropriate service classes.
   */
    @RequestMapping(value = "/helloworld", method = RequestMethod.DELETE)
    public void deleteOffer(@RequestParam Long id) {

        helloWorldService.deleteHelloWorld(id);
    }


}
