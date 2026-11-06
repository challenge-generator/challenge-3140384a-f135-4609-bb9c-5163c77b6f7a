package com.fintech.app.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target CAMPO_USUARIO = Target.the("Campo de texto para usuario")
            .located(By.id("com.example.fintechmock:id/et_username"));

    public static final Target CAMPO_CONTRASENA = Target.the("Campo de texto para contraseña")
            .located(By.id("com.example.fintechmock:id/et_password"));

    public static final Target BOTON_INGRESAR = Target.the("Botón Iniciar Sesión")
            .located(By.id("com.example.fintechmock:id/btn_login"));

    public static final Target MENSAJE_ERROR = Target.the("Mensaje de credenciales incorrectas")
            .located(By.id("com.example.fintechmock:id/tv_login_error"));
}