package pro.cherkassy.rboyko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import pro.cherkassy.rboyko.beans.CarImplament;

/**
 * Created by rboyko on 15.02.17.
 */
@Configuration
@ComponentScan({"pro.cherkassy.rboyko.beans","pro.cherkassy.rboyko.aspects"})
@EnableAspectJAutoProxy
public class Application {
    public static void main(String[] args){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Application.class);
        CarImplament carImplament=applicationContext.getBean("carImplament",CarImplament.class);
        carImplament.start();
    }
}
