package Capitulo2;//Demonstração do tempo de vida de uma variável

public class VarIntDemo {

    //main
    public static void main(String[]args){

        //variable main
        int x;

        for (x = 0; x < 3; x++){
            int y = -1; //será inicializada sempre que entrarmos no bloco (toda vez que o for atualizar)
            System.out.println("Y is " + y); // essa linha sempre exibirar -1

            y = 100;
            System.out.println("Y is now " + y);
        }
    }
}
