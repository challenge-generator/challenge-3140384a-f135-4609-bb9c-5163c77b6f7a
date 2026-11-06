package com.fintech.app.tests;

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
import static org.hamcrest.Matchers.equalTo;

@RunWith(SerenityRunner.class)
public class PortfolioTest {

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
    public void testConsultarSaldoDisponible() {
        analista.should(
                seeThat(ElSaldoDeCartera.valor(), equalTo("$ 1,500,000 USD"))
        );
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}