package Capitulo3;

//demonstração do laço do-while

public class DoWhileDemo {

    //main
    public static void main(String[]args)
    throws java.io.IOException{

        //variables
        char ch;

        do {
            System.out.print("Pressione um tecla e apos isso o ENTER: ");
            ch = (char) System.in.read();
        }while (ch != 'q');
    }
}
