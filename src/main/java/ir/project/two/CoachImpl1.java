package ir.project.two;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CoachImpl1 implements Coach{
    public CoachImpl1() {
        System.out.println(getClass().getSimpleName());
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("post construct:"+getClass().getSimpleName());
    }
    @PreDestroy
    public void preDestroy() {
        System.out.println("pre destroy:"+getClass().getSimpleName());
    }

    @Override
    public String getName() {
        System.out.println("print name:"+getClass().getSimpleName());
        return "impl 1";
    }
}
