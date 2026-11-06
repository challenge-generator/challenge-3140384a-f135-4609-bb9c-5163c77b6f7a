package com.fintech.app.tasks;

import com.fintech.app.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion implements Task {

    private final String usuario;
    private final String contrasena;

    public IniciarSesion(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public static IniciarSesion conCredenciales(String usuario, String contrasena) {
        return instrumented(IniciarSesion.class, usuario, contrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(LoginPage.CAMPO_USUARIO),
                Enter.theValue(contrasena).into(LoginPage.CAMPO_CONTRASENA),
                Click.on(LoginPage.BOTON_INGRESAR)
        );
    }
}