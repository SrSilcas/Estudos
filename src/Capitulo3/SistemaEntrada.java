package Capitulo3;//Demonstração

public class SistemaEntrada {

    //main
    public static void main (String[]args)
        throws java.io.IOException {

        //variables
        char ch;

        System.out.println("Digite algo em seguida aperte ENTER: ");

        ch = (char) System.in.read(); //sistema que identifica o que foi digitado

        System.out.println("O que foi digitado foi: " + ch);

    }
}
