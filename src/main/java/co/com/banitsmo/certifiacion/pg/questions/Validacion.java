package co.com.banitsmo.certifiacion.pg.questions;

import io.vavr.control.Validation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.banitsmo.certifiacion.pg.utils.Constant.URLPDFQUEMADA;

public class Validacion implements Question {

    @Override
    public Object answeredBy(Actor actor) {

        String url = actor.recall("URLPDF");
        String url2 = URLPDFQUEMADA;

        actor.attemptsTo(
                Ensure.that(url).isEqualTo(url2)

        );

        if ((url).equals(url2)){
            return true;
        }else{
            return false;
        }



    }
    public static Validacion ok()
    {return new Validacion();
    }
}

