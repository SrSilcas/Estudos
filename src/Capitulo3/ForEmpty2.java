package Capitulo3;

//Agora o iniciador do for está fora do laço

public class ForEmpty2 {

    //main
    public static void main(String[]args){

        //variables
        int i;
        i = 0;

        for(; i <= 10;){
            System.out.println("Pass #" + i);
            i++;
        }
    }
}
