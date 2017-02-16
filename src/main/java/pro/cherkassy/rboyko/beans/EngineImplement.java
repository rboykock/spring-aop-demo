package pro.cherkassy.rboyko.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pro.cherkassy.rboyko.beans.interfaces.Engine;

/**
 * Created by rboyko on 02.02.17.
 */
@Component
public class EngineImplement implements Engine {

    protected double engineСapacity;

    public EngineImplement( @Value("5.6") double engineСapacity) {
        this.engineСapacity = engineСapacity;
    }

    public double getEngineСapacity() {
        return engineСapacity;
    }

    public void setEngineСapacity(double engineСapacity) {
        this.engineСapacity = engineСapacity;
    }

    public void display() {
        System.out.println("V" + engineСapacity);
    }
}
