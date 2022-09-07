package Capitulo3;

//Usando break para para um "loop infinito"

public class Break2 {

    //main
    public static void main(String[]args)
    throws java.io.IOException{
        //variables
        char ch;
        for( ; ; ){
            ch = (char) System.in.read();
            if ( ch == 'q')break;
        }
        System.out.println("voce apertou q");
    }
}
