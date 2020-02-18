package com.cit.howtojunite2etest.tests;

import com.cit.howtojunite2etest.suporte.Navegador;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CriarUsuario {

    private WebDriver navegador;

    @Before
    public void before () {
        this.navegador = Navegador.criarNavegador();
    }

    @Test
    public void preencherFormularioCriacaoUsuario (){

    }

    @After
    public void after () {
        this.navegador.quit();
    }
}
