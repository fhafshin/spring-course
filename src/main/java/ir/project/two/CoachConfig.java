package ir.project.two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoachConfig {

    @Bean
    public Coach2 getCoach(){
            return new CoachImpl3();
    }
}
