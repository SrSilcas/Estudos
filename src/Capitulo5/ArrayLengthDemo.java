package Capitulo5;

//Demonstração da ferramenta length

public class ArrayLengthDemo {
    //main
    public static void main(String[]args){
        int list[] = new int[10];
        int nums[] = {1, 2, 3};
        int table [] [] = {
          {1, 2, 3},
          {4, 5},
          {6, 7, 8, 9}
        };
        System.out.println("O tamanho da list e: " + list.length);
        System.out.println("O tamanho da nums e: " + nums.length);
        System.out.println("O tamanho da table e: " + table.length);
        System.out.println("O tamanho da table[0] e: " + table[0].length);
        System.out.println("O tamanho da table[1] e: " + table[1].length);
        System.out.println("O tamanho da table[2] e: " + table[2].length);
        System.out.println();

        //usando o length para inicializar uma lista
        for (int i = 0; i < list.length; i++)
            list[i] = i * i;

        System.out.print("here is list: ");

        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

    }
}
