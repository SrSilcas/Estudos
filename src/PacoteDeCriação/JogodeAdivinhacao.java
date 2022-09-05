package PacoteDeCriação;

//jogo de adivinhação com if else e for

/*
Não consegui fazer o jogo de adivinhação com letras ainda, como deu para perceber ainda deixei a ideia com o throws
a ideia com números funcionou perfeitamente
*/
import java.util.Scanner;

public class JogodeAdivinhacao {

    //main
    public static void main (String[]args)
    throws java.io.IOException{

        Scanner scannerTexto = new Scanner(System.in);
        //variables
        int ch, answer;
        answer = 7;
        int verificador = 0;
        int tentativas;

        for (tentativas = 1;  verificador != 1; ++tentativas){

            System.out.println("Pensei em um numero de 1 a 10");
            System.out.println("Voce e capaz de adivinhar qual e?");

            ch = scannerTexto.nextInt();
//            ch = (char) System.in.read();

            if (ch == answer){
                System.out.println("***ACERTOU***");
                verificador = 1;
                System.out.println("Voce precisou de: " + tentativas + " tentativas.");
            }
            else {
                System.out.println("Voce errrrrooou, tente outra vez\n");
                System.out.println("tentativa numero:" + tentativas);
                if (ch < answer)
                    System.out.println("Mais para cima\n");
                else
                    System.out.println("Mais para baixo\n");
            }
        }
    }
}
