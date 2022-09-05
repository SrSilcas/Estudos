package Capitulo3;

//demonstração de declaração de variavel de controle dentro do laço for

public class ForVarInicial {

    //main
    public static void main (String[]args){

        //variables
        int sum = 0;
        int fact = 1;

        //calcula o fatorial dos números até 5
        for (int i = 1; i <= 5; i++){
            sum += i;
            fact += i;
        }
        System.out.println("Sum is " + sum);
        System.out.println("Fatorial is " + fact);
    }
}
