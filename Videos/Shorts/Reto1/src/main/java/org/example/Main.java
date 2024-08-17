package org.example;

public class Main {
    public static void main(String[] args) {
        String texto = "Hola Mundo";
        String textoInvertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }

        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido: " + textoInvertido);


    }
}
