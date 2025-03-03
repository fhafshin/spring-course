package ir.project.springcourse.rest;

import ir.project.two.Coach;
import ir.project.two.Coach2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

    private Coach coach;
    private Coach coach1;
    private Coach2 coach2;
    public HomeController(@Qualifier("coachImpl1") Coach coach,@Qualifier("coachImpl1") Coach coach1,Coach2 coach2) {
        this.coach = coach;
        this.coach1 = coach1;
        this.coach2 = coach2;
    }

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/")
    public String getAppName(){
        return appName;
    }

    @GetMapping("/coach")
    public Boolean getCoachName(){

        coach.getName();
        coach1.getName();

        return coach==coach1;
    }
    @GetMapping("/coach2")
    public String getCoach2Name(){




        return coach2.getName();
    }
}
