package Capitulo3;

//Reposta da questão de número 11 do Capitulo 3

public class Answer10CP3 {
    //main
    public static void main(String[]args)
    throws java.io.IOException{
        //variables
        int contador = 0;
        char bug, leitura, saida = '.';

        do {
            System.out.print("\n Digite um letra para ver como e a sua maiuscula. para sair aperte . \n");

            leitura = (char) System.in.read();
            do {
                bug = (char) System.in.read();
            }while (bug != '\n');

            if(leitura == saida)break;

            System.out.print(leitura + " ");
            leitura-=32;
            System.out.println(leitura);

        }while(leitura != saida);
    }
}
