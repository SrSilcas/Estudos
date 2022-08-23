public class IfDemo {
    /*
    This program is for explain if

    call this archive IfDemo
     */
    public static void main (String[]args){

        //Variables
        int a, b, c;

        a = 2;
        b = 3;

        //Code

        if (a < b) System.out.println ("a is less than b");
        //this instruction dont show nothing

        if (a == b) System.out.println("you won't see this");
        //this instruction dont show nothing too

        System.out.println( );

        c = a - b; // c contemn -1

        System.out.println("C contains -1");
        if (c >= 0)System.out.println("C is non-negative");
        if (c < 0 )System.out.println("C is negative");

        System.out.println();

        c = b - a; //now c = contains 1

        System.out.println("C contains 1");
        if (c >= 0)System.out.println("C is non-negative");
        if (c < 0 )System.out.println("C is negative");

    }
}
