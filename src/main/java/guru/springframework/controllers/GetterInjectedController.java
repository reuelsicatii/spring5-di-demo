package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 5/24/17.
 */
@Controller
public class GetterInjectedController {
    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("getterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    public String sayHello(){
    	System.out.println("\n =====Qualifier:Getter=====");
        return greetingService.sayGreeting();
    }
}
