package Capitulo2;//Demonstração de conversão de atribuição ampliadora automatica

public class LongtoDouble {

    //main
    public static void main (String[]args){

        //variables
        long L;
        double D;

        L = 100123285L;
        D = L;

        System.out.println("L and D: " + L + " " + D);
    }
/*
Demonstração de erro ao tentar converção automatica de um variavel maior para um menor
    //main
    public static void main (String[]args){

        //variables
        long L;
        double D;

        D = 100123285L;
        L = D;

        System.out.println("L and D: " + L + " " + D);
    }
*/
}

