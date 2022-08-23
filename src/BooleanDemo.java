//This program show how boolean works

public class BooleanDemo {

    //main
    public static void main(String[]args){

        //variables
        boolean b;

        b = false;

        //code program
        System.out.println("b is " + b);

        b = true;
        System.out.println("b is now " + b);

        //boolean with if
        if(b) System.out.println("This is executed");

        b = false;
        if(b) System.out.println("This is not executed");

        //this
        b = 10>9;
        System.out.println(b);

        //our
        System.out.println("10 > 9 is " + (10 > 9));


    }
}
