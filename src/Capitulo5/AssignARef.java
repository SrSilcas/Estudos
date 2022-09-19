package Capitulo5;

//Atribuindo variáveis de referência de array.

import java.sql.SQLOutput;

public class AssignARef {
    //main
    public static void main(String[]args){
        int nums1[] = new int[10];
        int nums2[] = new int[10];
        int i;

        for (i = 0; i < 10; i++)
            nums1[i] = i;
        for (i = 0; i < 10; i++)
            nums2[i] = -i;
        System.out.println("Aqui esta nums1: ");
        for (i =0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();

        System.out.println("Aqui esta nums2: ");
        for (i =0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        nums2 = nums1;

        System.out.println("Aqui eta o nums2 apos a referenciacao: ");
        for (i =0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        nums2 [3] = 99;

        System.out.println("Aqui eta o nums1 apos a mudanca em nums2 : ");
        for (i =0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();

    }
}
