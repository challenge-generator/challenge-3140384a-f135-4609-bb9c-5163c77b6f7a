package com.fintech.app.questions;

import com.fintech.app.ui.DashboardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElMensajeDeInversion implements Question<String> {

    public static Question<String> texto() {
        return new ElMensajeDeInversion();
    }

    @Override
    public String answeredBy(Actor actor) {
        return DashboardPage.MENSAJE_ESTADO.resolveFor(actor).getText();
    }
}