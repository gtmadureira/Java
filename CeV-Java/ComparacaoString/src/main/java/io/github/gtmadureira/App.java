package io.github.gtmadureira;

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

        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String ("Gustavo");
        String res1, res2, res3;
        res1 = (nome1==nome2)?"Igual":"Diferente";
        res2 = (nome1==nome3)?"Igual":"Diferente";
        res3 = (nome1.equals(nome3))?"Igual":"Diferente";
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }

}
