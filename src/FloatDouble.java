/*
This program show how the difference between int and double

Call this program FlotDouble
 */
public class FloatDouble {
    public static void main (String args[]){
        int var; //this instruction declare a variable int
        double x; //this instruction declare another variable but now is a floating dot

        var = 10;
        x = 10.0;

        System.out.println("Original value of var: " + var);
        System.out.println("Original value of x: " + x);
        System.out.println(); //displays a blank line

        //now divide the tow for 4

        var = var/4;
        x = x/4;

        System.out.println("var after division for 4: " + var);
        System.out.println("x after division for 4: " + x);
        System.out.println(" ");
    }
}
