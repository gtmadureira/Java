package io.github.gtmadureira;

public class Carro {

    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public int porta;
    public float peso;
    protected String placa;
    protected Boolean motor = false;
    protected Boolean farol = false;

    public void status() {
        
        System.out.println();
        System.out.println("O marca do carro é " + this.marca);
        System.out.println("O modelo do carro é " + this.modelo);
        System.out.println("O ano do carro é " + this.ano);
        System.out.println("A cor do carro é " + this.cor);
        System.out.println("O carro tem " + this.porta + " postas");
        System.out.println("O carro pesa " + this.peso + " Kg");
        System.out.println("A placa do carro é " + this.placa);

        if (this.motor == true) {
            System.out.println("O carro está ligado !");
        } else {
            System.out.println("O carro está desligado !");
        }

        if (this.farol == true) {
            System.out.println("O farol está ligado !");
        } else {
            System.out.println("O farol está desligado !");
        }
        
        System.out.println("Este objeto foi instanciado a partir de " + this);

    }    

    protected void ligarmotor() {
        
        this.motor = true;

    }

    protected void desligarmotor() {
        
        this.motor = false;

    }

    protected void ligarfarol() {
        
        this.farol = true;

    }

    protected void desligarfarol() {
        
        this.farol = false;

    }

}
