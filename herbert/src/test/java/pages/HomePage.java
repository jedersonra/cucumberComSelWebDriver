package pages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.Hooks;
import support.DriverQA;

public class HomePage extends Hooks {

    // **** COMENTEI O CODIGO ABAIXO POIS É O MODO MAIS BÁSICO DE INICIAR UMA PÁGINA

//    @Before
//    public void seTup()
//    {
//        System.setProperty("webdriver.chrome.driver", "/Users/herbert.soares/Documents/Git/Drivers/chromedriver");
//        WebDriver navegador = new ChromeDriver();
//        navegador.get("https://www.google.com");
//    }

    @Test
    public void Testenumero1(){


    }

    @Before
    public void beforeScenario(){

    }


    @After
    public void depoisDoTeste(){

    }

    public DriverQA driver;

    public HomePage(DriverQA stepDriver) {
        driver = stepDriver;
    }

    public void openPage() {
        String url = "https://www.americanas.com.br/";
        driver.openURL(url);
    }

    public void clickMotoG7() {
        driver.click("//a[@title='moto g7'][contains(text(),'moto g7')]", "xpath");
    }

    public String checkTextMotoG7() {
        return driver.getText("//h1[@class='page-title']", "xpath");
    }

}