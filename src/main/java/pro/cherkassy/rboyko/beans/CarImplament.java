package pro.cherkassy.rboyko.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pro.cherkassy.rboyko.beans.interfaces.Car;
import pro.cherkassy.rboyko.beans.interfaces.Engine;
import pro.cherkassy.rboyko.beans.interfaces.Wheels;

/**
 * Created by rboyko on 02.02.17.
 */
@Service
public class CarImplament implements Car {

    @Autowired
    protected Wheels wheels;
    @Autowired
    protected Engine engine;


    public CarImplament(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public void start() {
        engine.display();
        wheels.display();
    }
}
