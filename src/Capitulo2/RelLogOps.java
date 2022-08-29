package Capitulo2;//Programa demonstração de como funciona os opeeradores logicos

public class RelLogOps {

    //main
    public static void main (String[]args){

        //variables
        int i, j;
        boolean b1, b2;


        //relacionais
        i = 10;
        j = 11;

        if (i < j) System.out.println("i < j");
        if (i <= j) System.out.println("i <= j");
        if (i != j) System.out.println("i != j");
        if (i == j) System.out.println("This won't execute");
        if (i >= j) System.out.println("This won't execute");
        if (i > j) System.out.println("This won't execute");

        //logicos
        b2 = false;
        b1 = true;

        if (b1 & b2) System.out.println("This won't execute");
        if (!(b1 & b2)) System.out.println("!(b1  b2) is true");
        if (b1 | b2) System.out.println("b1 | b2 is true");
        if (b1 ^ b2) System.out.println("b1 ^b2 is true");
    }
}
