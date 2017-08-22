package IdolCompetition;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by ymukhin on 8/17/2017.
 */
@Aspect
public class Audience {
    @Pointcut("execution(* IdolCompetition.Performer.perform())")
    public void performance(){}
/*
    @Before("performance()")
    public void takeSeats(){ // before Performance
        System.out.println("The audience is taking their seats");
    }

    @Before("performance()")
    public void turnOffCellPhones(){// before Performance
        System.out.println("The audience is turning of their cellphones");
    }

    @AfterReturning("performance()")
    public void apppaud(){ //After performance
        System.out.println("Clap clap clap");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){ //After failed performance
        System.out.println("Boo! We want our money back");
    }
*/
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try{
            System.out.println("The audience is taking their seats");
            System.out.println("The audience is turning of their cellphones");
            long start = System.currentTimeMillis(); //before

            joinPoint.proceed();

            long end = System.currentTimeMillis();

            System.out.println("Clap clap clap");
            System.out.println("Time "+ (end - start));

        }catch (Throwable t){
            System.out.println("Boo! We want our money back");
        }
   }
}
