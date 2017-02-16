package pro.cherkassy.rboyko.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pro.cherkassy.rboyko.beans.interfaces.Tyres;

/**
 * Created by rboyko on 02.02.17.
 */
@Component("winterTyres")
public class WinterTyresImpl implements Tyres {

    @Value("Nokia")
    protected String name;
    @Value("18")
    protected int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void display() {
        System.out.println("Winter tyres " + name + " " + size + "d");
    }
}
