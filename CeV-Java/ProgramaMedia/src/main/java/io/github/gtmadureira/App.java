package io.github.gtmadureira;

import java.util.Scanner;

/**
 *  @author Gustavo Madureira
 *  @gtmadureira
 */

public class App {

    /**
     *  @param args the command line arguments
     */ 

    public static void main(String[] args) {

        // todo code application logic here

        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.print("Escreva a primeira nota: ");
        float nota1 = teclado.nextFloat();
        System.out.print("Escreva a segunda nota: ");
        float nota2 = teclado.nextFloat();
        teclado.close();
        System.out.println();
        float media = (nota1+nota2)/2;
        System.out.println("Sua média foi " + media);
        if (media>9) {
            System.out.println("Parabéns pela ótima nota pequeno gafanhoto!");
        }
    }

}
