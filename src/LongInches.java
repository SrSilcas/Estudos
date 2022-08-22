/*
This program show how you use variable long

this program show how many cubic inches have in cubic mile
* */
public class LongInches {

    public static void main (String args[]){

        //variables
        long ci,im;

        im = 5280*12;
        ci = im * im * im;

        //System out
        System.out.println("There are " + ci + " cubic inches in cubic mile");
    }
}
