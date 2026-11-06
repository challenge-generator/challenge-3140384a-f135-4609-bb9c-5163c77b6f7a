package com.fintech.app.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardPage {
    public static final Target TEXTO_SALDO = Target.the("Etiqueta con el saldo disponible")
            .located(By.id("com.example.fintechmock:id/tv_balance_amount"));

    public static final Target CAMPO_FONDO = Target.the("Campo nombre del fondo de inversión")
            .located(By.id("com.example.fintechmock:id/et_investment_fund"));

    public static final Target CAMPO_MONTO = Target.the("Campo monto a invertir")
            .located(By.id("com.example.fintechmock:id/et_amount"));

    public static final Target BOTON_INVERTIR = Target.the("Botón Ejecutar Inversión")
            .located(By.id("com.example.fintechmock:id/btn_invest"));

    public static final Target MENSAJE_ESTADO = Target.the("Mensaje de resultado de la inversión")
            .located(By.id("com.example.fintechmock:id/tv_transfer_status"));
}