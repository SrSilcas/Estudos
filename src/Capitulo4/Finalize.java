package Capitulo4;

public class Finalize {
    //main
    public static void main (String[]args){
        int count;

        FDemo ob = new FDemo(0);

        for (count = 1; count < 1000000; count++)
            ob.generator(count);
    }
}
