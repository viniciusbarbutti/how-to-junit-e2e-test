package com.cit.howtojunite2etest.tests;

import com.cit.howtojunite2etest.suporte.Navegador;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CriarUsuario {

    private WebDriver navegador;

    @Before
    public void before () {
        this.navegador = Navegador.criarNavegador();
    }

    @Test
    public void preencherFormularioCriacaoUsuario (){
        this.navegador.get("https://automacaocombatista.herokuapp.com/users/new");

        this.navegador.findElement(By.id("user_name")).sendKeys("Vinicius");
        this.navegador.findElement(By.id("user_lastname")).sendKeys("Teste");
        this.navegador.findElement(By.id("user_email")).sendKeys("teste@gmail.com");
        this.navegador.findElement(By.id("user_address")).sendKeys("Rua dos testes");
        this.navegador.findElement(By.id("user_university")).sendKeys("Puc-Campinas");
        this.navegador.findElement(By.id("user_profile")).sendKeys("QA");
        this.navegador.findElement(By.id("user_gender")).sendKeys("Masculino");
        this.navegador.findElement(By.id("user_age")).sendKeys("25");

        this.navegador.findElement(By.name("commit")).click();

        String mensagemSucesso = this.navegador.findElement(By.id("notice")).getText();

        Assert.assertEquals("Usuário Criado com sucesso", mensagemSucesso);

    }

    @After
    public void after () {
        this.navegador.quit();
    }
}
