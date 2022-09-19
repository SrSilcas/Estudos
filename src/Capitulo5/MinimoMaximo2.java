package Capitulo5;

public class MinimoMaximo2 {
    //main
    public static void main(String[]args){
        //variables
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int min, max;

        min = max = nums[0];

        for (int i =1; i < 10; i++){
            if (min > nums[i])min = nums[i];
            if (max < nums[i])max = nums[i];
        }
        System.out.println("O minimo e o maximo sao: " + min + " " + max);
    }
}
