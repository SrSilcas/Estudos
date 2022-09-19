package Capitulo5;

//Demonstração do funcionamento de array

public class ArrayDemo {
    //main
    public static void main (String[]args){
        //variables
        int sample [] = new int [10];
        int i;

        for (i = 0; i < 10; i = i + 1)
            sample [i] = i;

        for (i = 0; i < 10; i = i + 1)
            System.out.println("Isso e sample [ " + i + " ]: " + sample[i]);
    }
}
