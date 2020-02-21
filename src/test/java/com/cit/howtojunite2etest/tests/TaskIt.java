package com.cit.howtojunite2etest.tests;

import com.cit.howtojunite2etest.suporte.Navegador;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class TaskIt {
    private WebDriver navegador;

    @Before
    public void before () {
        this.navegador = Navegador.criarNavegador();
    }

    /* url da página de teste: http://www.juliodelima.com.br/taskit */
    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario () {

        this.navegador.get("http://www.juliodelima.com.br/taskit");

        // Clicar no link "Sign in"
        this.navegador.findElement(By.linkText("Sign in")).click();

        // Mudar o foco para a modal de Login
        WebElement formularioSignInBox = this.navegador.findElement(By.id("signinbox"));

        // Digitar no campo "login" (dentro do formulário) o texto "julio0001"
        formularioSignInBox.findElement(By.name("login")).sendKeys("julio0001");

        // Digitar no campo "password" (dentro do formulário) o texto "123456"
        formularioSignInBox.findElement(By.name("password")).sendKeys("123456");

        // Clicar no link "SIGN IN"
        this.navegador.findElement(By.linkText("SIGN IN")).click();

        // Clicar no no link "me"
        this.navegador.findElement(By.className("me")).click();

        // Clicar no link  "MORE DATA ABOUT YOU"
        this.navegador.findElement(By.linkText("MORE DATA ABOUT YOU")).click();

        // Clicar no botão "+ ADD MORE DATA"
        this.navegador.findElement(By.xpath("//button[@data-target=\"addmoredata\"]")).click();

        // Mudar o foco para a modal de formulário para adicionar mais dados
        WebElement popupAddMoreData = this.navegador.findElement(By.id("addmoredata"));

        // Escolher a opção Phone no combobox de type
        WebElement campoType = popupAddMoreData.findElement(By.name("type"));
        new Select(campoType).selectByVisibleText("Phone");

        // No campo de "contact" digitar "+5511999999999"
        popupAddMoreData.findElement(By.name("contact")).sendKeys("+5511999999999");

        // Clicar no link "SAVE" que está na popup
        popupAddMoreData.findElement(By.linkText("SAVE")).click();

        // Na mensagem validar que o texto é "Your contact has been added!"
        WebElement mensagemPop = this.navegador.findElement(By.id("toast-container"));
        String mensagem = mensagemPop.getText();
        assertEquals("Your contact has been added!", mensagem);
    }

    @After
    public void after () {
        this.navegador.quit();
    }
}
