//Apenas letra maiusculas.
package PacoteDeCriação;

public class AlfabetoFOR {

    //main
    public static void main (String[]args){

        //variables
        int count, count2;
        char alpha;

        count2 = 0;
        alpha = 65;

        for (count = 0; count <= 25; count++){
            System.out.print(alpha);
            System.out.print('\t');
            alpha++;
            count2++;

            if (count2 == 5) {
                System.out.println(" ");
                count2 = 0;
            }
        }
    }
}
