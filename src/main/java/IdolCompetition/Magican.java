package IdolCompetition;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by ymukhin on 5/15/2017.
 */
@Aspect
public class Magican implements MindReader {
    @Pointcut("execution(* IdolCompetition.Thinker.thinkOfSmth(String)) && args(thoughts))")
    public void thinking(String thoughts){}

    private String thoughts;

    public String getThoughts() {
        return thoughts;
    }

    @Before("thinking(thoughts)")
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts: " + thoughts);
        this.thoughts = thoughts;
    }
}
