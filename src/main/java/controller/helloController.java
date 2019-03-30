/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author EJ
 */
// this is a spring controller
@RestController // this is REST controller
public class helloController {
  
    //RequestMappig will only handle GET method type request 
    @RequestMapping("/hello") // this annotation is used to map 'localhost:8080/hello' hello is triggerd, sayHi function will be called and reurtn Hi
    public String sayHi(){
        return "Hi";
    }
}
