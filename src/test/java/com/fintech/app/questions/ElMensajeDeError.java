package com.fintech.app.questions;

import com.fintech.app.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElMensajeDeError implements Question<String> {

    public static Question<String> visible() {
        return new ElMensajeDeError();
    }

    @Override
    public String answeredBy(Actor actor) {
        return LoginPage.MENSAJE_ERROR.resolveFor(actor).getText();
    }
}