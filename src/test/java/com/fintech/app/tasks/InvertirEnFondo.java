package com.fintech.app.tasks;

import com.fintech.app.ui.DashboardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InvertirEnFondo implements Task {

    private final String fondo;
    private final String monto;

    public InvertirEnFondo(String fondo, String monto) {
        this.fondo = fondo;
        this.monto = monto;
    }

    public static InvertirEnFondo conDatos(String fondo, String monto) {
        return instrumented(InvertirEnFondo.class, fondo, monto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(fondo).into(DashboardPage.CAMPO_FONDO),
                Enter.theValue(monto).into(DashboardPage.CAMPO_MONTO),
                Click.on(DashboardPage.BOTON_INVERTIR)
        );
    }
}