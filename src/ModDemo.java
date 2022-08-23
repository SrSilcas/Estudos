//Demonstração do operador %
public class ModDemo {

    //main
    public static void main (String[]args){

        //variables
        int iresult, irem;
        double deresult, drem;

        iresult = 10 / 3;;
        irem = 10 % 3;

        deresult = 10.0 / 3.0;
        drem = 10 % 3;

        System.out.println("Resultado e resto de 10/3: " + iresult + " " + irem);
        System.out.println("Resultado e resto de 10.0/3.0: " + deresult + " " + drem);
    }
}
