/*
This program is the answer for the question 10

This program change Feats to meters.
*/
public class Awnser10 {

    //main
    public static void main (String args[]){

        //Variables
        double meters, feats;
        int counter;

        counter = 0;
        //for code
        for (feats = 1; feats <= 144; feats++){
            meters = feats * 0.0254005; //conversion
            System.out.println(feats + " feats is " + meters + " meters.");

            counter++;

            //if for white line
            if (counter == 12){
                System.out.println();
                counter = 0;
            }
        }
    }
}
