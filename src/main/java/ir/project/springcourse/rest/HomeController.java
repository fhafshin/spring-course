package ir.project.springcourse.rest;

import ir.project.two.Coach;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

    private Coach coach;

    public HomeController(Coach coach) {
        this.coach = coach;
    }

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/")
    public String getAppName(){
        return appName;
    }

    @GetMapping("/coach")
    public String getCoachName(){
        return coach.getName();
    }
}
