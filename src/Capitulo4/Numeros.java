package Capitulo4;

public class Numeros {

    public static void main (String[]args){

        ChekNumeros numeros = new ChekNumeros();

        if (numeros.ePar(10))System.out.println("10 e par");
        if (numeros.ePar(9))System.out.println("9 e par");
        if (numeros.ePar(8))System.out.println("8 e par");

        if (numeros.fator(2, 20))System.out.println("2 e fator de 20");
        if (numeros.fator(3, 20))System.out.println("3 e fator de 20");
    }
}
