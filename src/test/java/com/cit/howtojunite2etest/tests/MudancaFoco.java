package com.cit.howtojunite2etest.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MudancaFoco {

    private WebDriver navegador;

    @Before
    public void before () {

    }

    /* url da página de teste: https://automacaocombatista.herokuapp.com/mudancadefoco/alert */
    @Test
    public void validarJsAlert () {

        /* implementar e teste automatizado para a validação abaixo */

        String result = this.navegador.findElement(By.id("result")).getText();
        Assert.assertEquals("Você clicou no alerta com sucesso!!", result);
    }

    /* url da página de teste: https://automacaocombatista.herokuapp.com/mudancadefoco/alert */
    @Test
    public void validarJsConfirm () {

        /* implementar e teste automatizado para a validação abaixo */

        String result = this.navegador.findElement(By.id("result")).getText();
        Assert.assertEquals("Você clicou: Ok", result);
    }

    /* url da página de teste: https://automacaocombatista.herokuapp.com/mudancadefoco/alert */
    @Test
    public void validarJsPrompt () {
        /* implementar e teste automatizado para a validação abaixo */

        String result = this.navegador.findElement(By.id("result")).getText();
        Assert.assertEquals("Você digitou: NEXT GEN", result);
    }

    /* url da página de teste: https://automacaocombatista.herokuapp.com/mudancadefoco/janela */
    @Test
    public void validarAberturaNovaAba () {

        /* implementar e teste automatizado para a validação abaixo */

        String result = this.navegador.findElement(By.className("red-text text-darken-1 center")).getText();
        Assert.assertEquals("Você Abriu uma nova janela!!", result);
    }

    /* url da página de teste: https://automacaocombatista.herokuapp.com/mudancadefoco/modal */
    @Test
    public void validarAberturaModal () {

        /* implementar e teste automatizado para a validação abaixo */

    }

    @After
    public void after () {

    }
}
