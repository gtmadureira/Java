package testetipos;


public class App {

    public static void main(String[] args) throws Exception {
        
        int iDade1 = 30;
        // String valor = idade;                           <- errado !
        // String valor = (String) idade;                  <- errado !
        String vAlor1 = Integer.toString(iDade1);       // <- correto !
        System.out.println(vAlor1);

        String vAlor2 = "30";
        // int idade = valorNovo;                          <- errado !
        // int idade = (int) valorNovo;                    <- errado !
        int iDade2 = Integer.parseInt(vAlor2);          // <- correto !        
        System.out.println(iDade2);

        String vAlor3 = "30.5";
        float iDade3 = Float.parseFloat(vAlor3);        // <- correto !
        System.out.printf("%.3f \n", iDade3);
        
    }

}
