package Capitulo3;//Jogo de adivinhação simples

public class IfElseDemo {

    //main
    public static void main (String[]args)
    throws java.io.IOException{

        //variables
        char ch, answer = 'k';

        System.out.println("Pensei em uma letra entre A e Z.");
        System.out.println("Sera que voce e capaz de acertar qual e ?");

        ch = (char) System.in.read(); //leitura da resposta

        if (ch==answer) System.out.println("***Acertou***");
        else System.out.println("Desculpa mas voce errou");
    }
}
