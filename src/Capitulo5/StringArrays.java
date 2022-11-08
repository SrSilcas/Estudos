package Capitulo5;

public class StringArrays {
    public static void main(String[]args){
        String [] strings = {"This", "is", "a", "test"};
        for (String s: strings){
            System.out.print(s + " ");
        }
        System.out.println();

        strings[1] = "was";
        strings[3] = "test, too";

        for (String s: strings){
            System.out.print(s + " ");
        }
    }
}
