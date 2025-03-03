package ir.project.two;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class CoachImpl2 implements Coach {
    public CoachImpl2() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public String getName() {
        return "impl 2";
    }
}
