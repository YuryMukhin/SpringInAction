import IdolCompetition.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ymukhin on 5/10/2017.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_bean.xml");

        Performer performer = (Performer) ctx.getBean("duke15");
        performer.perform();

        Thinker reader = (Thinker) ctx.getBean("volunteer");
        reader.thinkOfSmth("smth");

        MindReader m = (MindReader)ctx.getBean("magican");
        System.out.println(m.getThoughts());
    }
}
