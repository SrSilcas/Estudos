package Capitulo3;

//Resposta da questão de número 4 do capitulo 3

public class Answer4CP3 {
    //main
    public static void main(String[]args){
        //variables
        int count, numero;
        count = 0;
        for (numero = 1000; numero >= 0; numero-=2){
            System.out.print(numero + " ");
            count++;
            if (count == 9){
                System.out.println(" ");
                count = 0;
            }
        }
    }
}
