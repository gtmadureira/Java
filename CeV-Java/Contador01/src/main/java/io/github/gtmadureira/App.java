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

        int cc = 0;
        
        while (cc<10) {

            cc++;
            if (cc==2 || cc==3 || cc==4) {
                continue;
            }
            if (cc==7) {
                break;
            }
            System.out.println("Cambalhota " + cc);            
            
        }
        
    }

}
