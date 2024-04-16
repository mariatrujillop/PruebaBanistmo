package co.com.banitsmo.certifiacion.pg.tasks;

import co.com.banitsmo.certifiacion.pg.interactions.ChangeWindows;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.banitsmo.certifiacion.pg.userinterfaces.BarraNavegacion.*;

public class ValidaPDF implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(ACEPTAR_AVISO, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(ACEPTAR_AVISO),
                WaitUntil.the(PRODUCTOS_Y_SERVICIOS,WebElementStateMatchers.isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(PRODUCTOS_Y_SERVICIOS),
                WaitUntil.the(DEPOSITOS,WebElementStateMatchers.isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(DEPOSITOS),
                Scroll.to(CUENTA_AHORRO_COMERCIAL).andAlignToTop(),
                WaitUntil.the(CUENTA_AHORRO_COMERCIAL,WebElementStateMatchers.isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(CUENTA_AHORRO_COMERCIAL),
                Scroll.to(DOCUMENTOS).andAlignToTop(),
                WaitUntil.the(DOCUMENTOS,WebElementStateMatchers.isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(DOCUMENTOS),
                ChangeWindows.number(),
                WaitUntil.the(DESCARGAR_PDF,WebElementStateMatchers.isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(DESCARGAR_PDF),
                ChangeWindows.number()


        );

        actor.remember("URLPDF",Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl());


    }

    public static ValidaPDF enter(){
        return Tasks.instrumented(ValidaPDF.class);
    }




}
