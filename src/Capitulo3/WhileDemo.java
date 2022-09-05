package Capitulo3;

//demonstração do laço while, programa de exibição de alfabeto

public class WhileDemo {

    //main
    public static void main(String[]args){

        //variables
        char ch;
        ch = 'a';

        while (ch <= 'z') {
            System.out.print(ch);
            ch++;
        }
    }
}
