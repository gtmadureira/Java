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

        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        // r = (x<y && y<z)?true:false;
        // r = (x<y || y==z)?true:false;
        r = (x<y ^ y<z)?true:false;
        System.out.println(r);
        
    }

}
