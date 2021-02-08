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
        System.out.print("Em que ano você nasceu ? : ");
        int nasc = teclado.nextInt();
        teclado.close();        
        int idade = 2020 - nasc;
        System.out.println("Sua idade é " + idade);
        if (idade>=18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }
    }

}
