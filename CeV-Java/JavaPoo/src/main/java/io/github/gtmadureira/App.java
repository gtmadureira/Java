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

        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.marca = "Nissan";
        c1.modelo = "Versa";
        c1.ano = 2018;
        c1.cor = "Preto";
        c1.porta = 4;
        c1.peso = 985.5f;
        c1.placa = "XYZ-8088";
        c1.ligarmotor();
        c1.ligarfarol();
        c1.status(); // Status do carro 1.

        c2.marca = "Fiat";
        c2.modelo = "Uno";
        c2.ano = 2001;
        c2.cor = "Branco";
        c2.porta = 2;
        c2.peso = 530f;
        c2.placa = "ABC-1234";
        c2.desligarmotor();
        c2.ligarfarol();
        c2.status(); // Status do carro 2.
        
    }

}
