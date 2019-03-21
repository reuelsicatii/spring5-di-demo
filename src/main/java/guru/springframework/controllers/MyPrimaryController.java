package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 5/23/17.
 */
@Controller
public class MyPrimaryController {

	@Autowired
    private GreetingService greetingService;


    public String sayHello(){
    	System.out.println("\n =====Primary=====");
        return greetingService.sayGreeting();
    }
}
