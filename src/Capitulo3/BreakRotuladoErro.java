package Capitulo3;

//Ese programa contem um erro com break rotulado (erro comentando para poder compilar o resto dos programas.)

public class BreakRotuladoErro {
    //main
    public static void main(String[]args){
        um:{
            for (int i = 0; i < 3; i++){
                System.out.println("i e " + i);
            }
        }
        for (int i = 0; i<100; i++){
            if (i==10)break; //um;//erro
            System.out.println("i e "+i);
        }
    }
}
