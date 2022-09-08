package Capitulo4;

public class Vehicle {

    int passengers; //numero de passageiros que o veículo suporta.
    int fuelcap; //capacidade de gasolina que o carro comporta em galões.
    int mpg; //quantidade de milhas percorridas com 1 galão de gasolina.


    //retorna a quantidade de milhas que o veículo consegue percorrer com um tanque cheio
    void range(){
        System.out.println("Consegue percorrer " + fuelcap * mpg + " milhas com um tanque de combustivel");
    }

    //retorna a quantidade de galões de gasolina necessários para andar determinada quantidade de milhas
    double gasPreciso(int milhas){
        return (double) milhas/mpg;
    }
}
