package IdolCompetition;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by ymukhin on 8/17/2017.
 */
public class Audience {
    public void takeSeats(){ // before Performance
        System.out.println("The audience is taking their seats");
    }

    public void turnOffCellPhones(){// before Performance
        System.out.println("The audience is turning of their cellphones");
    }

    public void apppaud(){ //After performance
        System.out.println("Clap clap clap");
    }

    public void demandRefund(){ //After failed performance
        System.out.println("Boo! We want our money back");
    }

   public void watchPerformance(ProceedingJoinPoint joinPoint){
        try{
            System.out.println("The audience is taking their seats");
            System.out.println("The audience is turning of their cellphones");
            long start = System.currentTimeMillis(); //before

            joinPoint.proceed();

            long end = System.currentTimeMillis();

            System.out.println("Clap clap clap");
            System.out.print("Time "+ (end - start));

        }catch (Throwable t){
            System.out.println("Boo! We want our money back");
        }
   }
}
