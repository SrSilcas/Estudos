package Capitulo3;

//Resposta da questão de número 1 do capitulo 3

public class Answer1CP3 {
    //main
    public static void main (String[]args)
    throws java.io.IOException{
        //variables
        char escolha, resposta = '.';
        char bug;
        int contador = 0;

        do {
            System.out.print("Digite um caractere para tentar acertar:");
            escolha = (char) System.in.read();

            do {
                bug = (char) System.in.read();
            }while (bug !='\n');

            if (escolha != resposta) System.out.println("\nVoce errou tente de novo\n");
            contador++;
        }while (escolha != resposta);
        System.out.println("Acertou..");
        System.out.println("Voce precisou de " + contador + " tentativas para acertar");
    }
}
