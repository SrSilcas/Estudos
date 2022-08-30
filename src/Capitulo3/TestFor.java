package Capitulo3;

//Laco execultado até o S ser apertado

public class TestFor {

    //main if Excepition
    public static void main(String[]args)
        throws java.io.IOException{

        //variables
        int i;

        System.out.println("Pressione S para parar");

        for (i =0; (char) System.in.read() != 'S'; i++)
            System.out.println("Passagem #" + i);
    }
}
