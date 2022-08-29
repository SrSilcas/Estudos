package Capitulo2;//Demonstração de funcionamento de alinhamento de escopos

public class ScopeDemo {

    //main
    public static void main(String[]args){

        //variables
        int x; //conhecida pelo código dentro de main

        x = 10;

        if (x==10) { //iniciando novo escopo

            int y = 20; //conhecida apenas nesse bloco de codigo
            //tanto x quanto y são conhecidos aqui

            System.out.println("x and y: " + x + " " + y);

            x= y * 2;
        }
        //y = 100; Erro! Y não é conhecido fora do bloco de codigo

        //x ainda é conhecido
        System.out.println("x is " + x);
    }
}
