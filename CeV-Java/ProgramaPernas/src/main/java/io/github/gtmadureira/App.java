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

        Scanner tec= new Scanner(System.in);
        System.out.print("Quantas pernas ? ");
        int perna = tec.nextInt();
        tec.close();

        String tipo;       

        switch (perna) {
            case 1:
                tipo = "Saci";                
                break;
            case 2:
                tipo = "Bípede";                
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6: case 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }

        System.out.println("Isso é um(a) " + tipo);

    }

}
