package br.una.aulateste01;

public class StringUtils {

    public static String retornaHelloWorld() {
        return "Hello World";
    }

    public static String concatena(String primeiraPalavra, String segundaPalavra) {
        return primeiraPalavra + " " + segundaPalavra;
    }

    public static String concatena3(String st1, String st2, String st3) {
        return st1 + " " + st2 + " " + st3;
    }

    public static int qtpalavras(String palavra)
    {
        return palavra.length();
    }

    public static String tamannhoParouImpar(String palavra) {
        int tamanho = qtpalavras(palavra);

        if(tamanho%2 > 0){
            return "Impar";
        }
        else return "Par";
    }
}