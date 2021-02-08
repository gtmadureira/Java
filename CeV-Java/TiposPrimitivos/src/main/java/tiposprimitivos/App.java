package tiposprimitivos;


import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        teclado.close();
        
        /*
        * float nota = (float) 8.5;
        * FLoat nota = new Float(8.5);   up to  Java 8
        */
        
        System.out.print(nota + "\n");
        System.out.println("A nota é " + nota);
        System.out.printf("A nota de %s é %.3f \n", nome, nota);
        System.out.format("A nota de %s é %.1f \n", nome, nota);
    }

}
