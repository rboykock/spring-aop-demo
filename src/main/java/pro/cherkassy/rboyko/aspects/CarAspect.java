package pro.cherkassy.rboyko.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by rboyko on 15.02.17.
 */
@Component
@Aspect
public class CarAspect {
    @Before("execution(* pro.cherkassy.rboyko.beans.EngineImplement.display(..))")
    public void displayEndine(){
        System.out.print("Engine:");
    }

    @Before("execution(* pro.cherkassy.rboyko.beans.WheelsImplement.display(..))")
    public void displayWheels(){
        System.out.print("Wheels:");
    }

    @Before("execution(* pro.cherkassy.rboyko.beans.*TyresImpl.display(..))")
    public void displayTyres(){
        System.out.println("Tyres:");
    }
}
