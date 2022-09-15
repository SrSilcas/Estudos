package Capitulo4;

public class MyCounter {
    int numeroConta;
    int agencia;

    MyCounter(int numeroConta, int agencia){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
    }

    void demonstração (){
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Agencia: " + this.agencia);
    }

    double myMeth(int a, int b){
        double value = (double) a / b;
        System.out.println(value);
        return value;
    }
}
