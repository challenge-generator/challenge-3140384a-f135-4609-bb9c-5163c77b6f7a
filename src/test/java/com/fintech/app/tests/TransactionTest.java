package com.fintech.app.tests;

import com.fintech.app.questions.ElMensajeDeInversion;
import com.fintech.app.tasks.IniciarSesion;
import com.fintech.app.tasks.InvertirEnFondo;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

@RunWith(SerenityRunner.class)
public class TransactionTest {

    private AppiumDriver<MobileElement> driver;
    private final Actor analista = Actor.named("Inversionista");

    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "AndroidDevice");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appPackage", "com.example.fintechmock");
        capabilities.setCapability("appActivity", ".MainActivity");

        driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/"), capabilities);
        analista.can(BrowseTheWeb.with(driver));

        analista.attemptsTo(
                IniciarSesion.conCredenciales("pragma", "123456")
        );
    }

    @Test
    public void testEjecutarInversionExitosa() {
        analista.attemptsTo(
                InvertirEnFondo.conDatos("S&P 500", "50000")
        );

        analista.should(
                seeThat(ElMensajeDeInversion.texto(), containsString("¡Inversión exitosa de $50000 en el fondo S&P 500!"))
        );
    }

    @Test
    public void testInversionCamposVacios() {
        analista.attemptsTo(
                InvertirEnFondo.conDatos("", "")
        );

        analista.should(
                seeThat(ElMensajeDeInversion.texto(), containsString("Por favor ingrese todos los datos."))
        );
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}