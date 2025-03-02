package ir.project.springcourse.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/")
    public String getAppName(){
        return appName;
    }
}
