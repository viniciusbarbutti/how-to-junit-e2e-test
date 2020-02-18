package com.cit.howtojunite2etest.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TaskIt {
    private WebDriver navegador;

    @Before
    public void before () {

    }

    /* url da página de teste: http://www.juliodelima.com.br/taskit */
    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario () {

        // Clicar no link "Sign in"

        // Mudar o foco para a modal de Login

        // Digitar no campo "login" (dentro do formulário) o texto "julio0001"

        // Digitar no campo "password" (dentro do formulário) o texto "123456"

        // Clicar no link "SIGN IN"

        // Clicar no no link "me"

        // Clicar no link  "MORE DATA ABOUT YOU"

        // Clicar no botão "+ ADD MORE DATA"

        // Mudar o foco para a modal de formulário para adicionar mais dados

        // Escolher a opção Phone no combobox de type

        // No campo de "contact" digitar "+5511999999999"

        // Clicar no link "SAVE" que está na popup

        // Na mensagem validar que o texto é "Your contact has been added!"

    }

    @After
    public void after () {

    }
}
