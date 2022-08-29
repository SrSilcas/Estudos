package Capitulo2;

//Rsposta da questão 10 do capitulo 2 do livro de java (com ajuda).
public class Answer10CP2 {

    //main
    public static void main (String[]args){

        //variables
        int i, j;
        boolean primo;

        for (i = 2; i <= 100; i++) {
            primo = true;

            for (j = 2; j <= i/j; j++)
                if ((i % j) == 0) primo = false;

                if(primo) System.out.println(i + " e primo");
        }
    }
}
