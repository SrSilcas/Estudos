package Capitulo3;

//usando continue para pular uma parte do laço

public class ContinueDemo {
    //main
    public static void main(String[]args){
        //variables
        int i;
        for (i = 0; i <= 100; i++){
            if ((i % 2) != 0) continue;
            System.out.println(i);
        }
    }
}
