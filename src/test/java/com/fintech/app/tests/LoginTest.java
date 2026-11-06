package com.fintech.app.tests;

import com.fintech.app.questions.ElMensajeDeError;
import com.fintech.app.questions.ElSaldoDeCartera;
import com.fintech.app.tasks.IniciarSesion;
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
import static org.hamcrest.Matchers.equalTo;

@RunWith(SerenityRunner.class)
public class LoginTest {

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
    }

    @Test
    public void testLoginExitoso() {
        analista.attemptsTo(
                IniciarSesion.conCredenciales("pragma", "123456")
        );

        analista.should(
                seeThat(ElSaldoDeCartera.valor(), containsString("$ 1,500,000 USD"))
        );
    }

    @Test
    public void testLoginCredencialesIncorrectas() {
        analista.attemptsTo(
                IniciarSesion.conCredenciales("usuario_invalido", "000000")
        );

        analista.should(
                seeThat(ElMensajeDeError.visible(), equalTo("Credenciales incorrectas"))
        );
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}