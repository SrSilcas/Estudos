package Capitulo3;

//demonstração de do-while com o jogo de adivinhação

public class JogoAdivinhacaoComDoWhile {

    //main
    public static void main(String[]args)
    throws java.io.IOException{

        //variables
        char ch, ignore, answer = 'K';

        do {
            System.out.println("Estou pensando em uma letra entre A e Z");
            System.out.print("Voce consegue adivinhar qual e? ");

            //lê um char
            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            }while (ignore != '\n');

            if (ch == answer)
                System.out.println("Acertouuu");
            else{
                System.out.print("Voce errou, voce chutou, ");
                if (ch < answer)
                    System.out.println("Muito baixo");
                else
                    System.out.println("Muito alto");

                System.out.println("Tente outra vez\n");
            }
        } while (answer != ch);
    }
}
