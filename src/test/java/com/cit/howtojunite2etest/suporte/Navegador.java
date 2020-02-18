package com.cit.howtojunite2etest.suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Navegador {

    public static WebDriver criarNavegador(){

        // informa o caminho do chromedriver.exe
        String pastaUsuario = System.getProperty("user.home");
        System.setProperty("webdriver.chrome.driver", pastaUsuario.concat("/drivers/chromedriver.exe"));

        // criar o navegador (chrome)
        WebDriver navegador = new ChromeDriver();

        // informar que o navegador deve aguardar um elemento carregar por 10 segundos
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navegador.manage().window().maximize();

        return navegador;
    }
}
