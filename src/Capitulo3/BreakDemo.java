package Capitulo3;

//Usando o break para sair de um laço.

public class BreakDemo {

    //main
    public static void main(String[]args){
        //variables
        int num;
        num = 100;

        for (int i = 1; i < num; i++){
            if (i*i > num)break;

            System.out.print(i + " ");
        }
        System.out.println("Loop completo.");
    }
}
