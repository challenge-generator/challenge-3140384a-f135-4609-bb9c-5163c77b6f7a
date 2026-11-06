package com.fintech.app.questions;

import com.fintech.app.ui.DashboardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElSaldoDeCartera implements Question<String> {

    public static Question<String> valor() {
        return new ElSaldoDeCartera();
    }

    @Override
    public String answeredBy(Actor actor) {
        return DashboardPage.TEXTO_SALDO.resolveFor(actor).getText();
    }
}