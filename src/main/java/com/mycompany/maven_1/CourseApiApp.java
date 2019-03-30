/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven_1;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication  // --> this annotation tells springboot that this is our starting point of application
@SpringBootApplication(scanBasePackages = {"com.spring"})
@ComponentScan("controller,topic")
@EntityScan("topic")
@EnableJpaRepositories("topic")
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class CourseApiApp {
    public static void main(String[] args) {
        
        // step 1 : we need to tell this class that this is a springboot application 
        
        // 1- we need to tell springboot to start this applciation (this class)
        // 2- create a servelet container
        // 3 -host this appliclation on this servelet container
        // and this all can be done using one line (one static method)
        
        SpringApplication.run(CourseApiApp.class, args); // this is our spring boot application
        
        
         
    }
    
}
