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
        // cria o navegador
        this.navegador = Navegador.criarNavegador();
    }

    @Test
    public void preencherFormularioCriacaoUsuario (){

        // navega ate a pagina informada
        this.navegador.get("https://automacaocombatista.herokuapp.com/users/new");

        // escrever "Vinicius" no elemento que possui o id "user_name"
        this.navegador.findElement(By.id("user_name")).sendKeys("Vinicius");

        // escrever "Teste" no elemento que possui o id "user_lastname"
        this.navegador.findElement(By.id("user_lastname")).sendKeys("Teste");

        // escrever "teste@gmail.com" no elemento que possui o id "user_email"
        this.navegador.findElement(By.id("user_email")).sendKeys("teste@gmail.com");

        // escrever "Rua dos testes" no elemento que possui o id "user_address"
        this.navegador.findElement(By.id("user_address")).sendKeys("Rua dos testes");

        // escrever "Puc-Campinas" no elemento que possui o id "user_university"
        this.navegador.findElement(By.id("user_university")).sendKeys("Puc-Campinas");

        // escrever "QA" no elemento que possui o id "user_profile"
        this.navegador.findElement(By.id("user_profile")).sendKeys("QA");

        // escrever "Masculino" no elemento que possui o id "user_gender"
        this.navegador.findElement(By.id("user_gender")).sendKeys("Masculino");

        // escrever "25" no elemento que possui o id "user_age"
        this.navegador.findElement(By.id("user_age")).sendKeys("25");

        // clicar no botão com nome "commit"
        this.navegador.findElement(By.name("commit")).click();

        // buscar o text do elemento com o id "notice"
        String mensagemSucesso = this.navegador.findElement(By.id("notice")).getText();

        //  validar se a mensagem "Usuario Criado com sucesso" é exibida
        Assert.assertEquals("Usuário Criado com sucesso", mensagemSucesso);
    }

    @After
    public void after () {
        // fechar o navegador
        this.navegador.quit();
    }
}
