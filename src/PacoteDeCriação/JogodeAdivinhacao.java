package PacoteDeCriação;

//jogo de adivinhação com if else e for

//BUG está rodando duas vezes, marcado.

public class JogodeAdivinhacao {

    //main
    public static void main (String[]args)
    throws java.io.IOException{

        //variables
        char ch, answer;
        answer = 'k';
        int question = 0;
        int tentativas;

        for (tentativas = 1;  question != 1; ++tentativas){

            System.out.println("Pensei em uma letra entra A e Z");
            System.out.println("Voce e capaz de adivinhar qual e?");

            ch = (char) System.in.read(); //o sistema está rodando duas vezes CORRIGIR!!

            if (ch == answer){
                System.out.println("***ACERTOU***");
                question = 1;
                System.out.println("Voce precisou de: " + tentativas + " tentativas.");
            }
            else {
                System.out.println("Voce errrrrooou, tente outra vez");
                System.out.println("tentariva numero:" + tentativas);}
        }
    }
}
