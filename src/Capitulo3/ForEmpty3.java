package Capitulo3;

//corpo de um laço for pode estar vazio

public class ForEmpty3 {

    //main
    public static void main(String[]args){

        //variables
        int i;
        int sum = 0;

        //soma dos numeros até 5

        for (i = 1; i<=5; sum += i++);

        System.out.println("Sum is " + sum);
    }
}
