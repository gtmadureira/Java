package io.github.gtmadureira;


public class App {

    public static void main(String[] args) throws Exception {
        
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.format("A média é igual a %.3f \n", m);*/
        
        /*int numero = 10;
        int valor = 4 + numero--;
        System.out.println(valor);
        System.out.println(numero);*/

        int x = 4;
        x += 2; // x = x + 2
        System.out.println(x);

        float y = (float) Math.PI;
        y *= 2; // y = y * 2
        System.out.println(y);

        int z = 25;
        z /= 5; // z = z / 5
        System.out.println(z);

        int k = (int) Math.pow(2, 8);
        k /= 2; // k = k / 2
        System.out.println(k);

        int i = (int) Math.sqrt(3); // *** Apenas pegou a parte inteira do resultado.
        i += 2; // i = i + 2
        System.out.println(i);

        int j = (int) Math.cbrt(125);
        j *= 4; // j = j * 4
        System.out.println(j);
        
        float v = 8.4f;
        int ar = (int) Math.round(v);
        System.out.println(ar);

        double ale = Math.random();
        int n = (int) (15 + ale * (50 - 15));
        System.out.println(n);
        
    }

}
