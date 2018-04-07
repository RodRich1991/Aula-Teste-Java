package br.una.aulateste01;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
import java.io.*;

public class StringUtilsTest {

    @Test
    public void retornaHelloWorld() {
        String retorno = StringUtils.retornaHelloWorld();

        assertThat(retorno, is("Hello World"));
    }

    @Test
    public void contatenaHelloEWorld(){
        String retorno = StringUtils.concatena("Hello", "World");

        assertThat(retorno, is("Hello World"));
    }

    @Test
    public void contatenaOlaMundo(){
        String retorno = StringUtils.concatena("Ola", "Mundo");

        assertThat(retorno, is("Ola Mundo"));
    }

    @Test
    public void contatenaRodrigoJunioCosta(){
        String retorno = StringUtils.concatena3("Rodrigo","Junio","Costa");

        assertThat(retorno, is("Rodrigo Junio Costa"));
    }

    @Test
    public void palavras(){
        int retorno = StringUtils.qtpalavras("Uberlandia");

        assertThat(retorno, is(10));
    }

    @Test
    public void caladas(){
        int retorno = StringUtils.qtpalavras("rodi");

        assertThat(retorno, is(4));
    }

    @Test
    public void testaSeParOuImpar1(){
        String retorno = StringUtils.tamannhoParouImpar("UNA");

        assertThat(retorno, is("Impar"));
    }

    @Test
    public void testaSeParOuImpar2(){
        String retorno = StringUtils.tamannhoParouImpar("Soma");

        assertThat(retorno, is("Par"));
    }
}
