package pro.cherkassy.rboyko.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pro.cherkassy.rboyko.beans.interfaces.Tyres;
import pro.cherkassy.rboyko.beans.interfaces.Wheels;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by rboyko on 02.02.17.
 */
@Component
public class WheelsImplement implements Wheels {

    protected  Tyres[] tyres=new Tyres[4];

    public Tyres[] getTyres() {
        return tyres;
    }

    @Qualifier("winterTyres")
    @Autowired
    public void setTyres(Tyres tyres) {
        for (int i=0;i<4;i++)
            this.tyres[i]=tyres;
    }

    public void display() {
        Stream<Tyres> tyresStream= Arrays.stream(tyres);
        tyresStream.forEach(x -> x.display());
    }
}
