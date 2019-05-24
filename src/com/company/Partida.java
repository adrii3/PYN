package com.company;
import java.util.Scanner;

public class Partida {

    int sumatorio;
    int contador;
    int contadorMaquina;

    void enseñarTurno1(){
        System.out.println("Turno del jugador");
        System.out.println();
    }

    void enseñarTurno2(){
        System.out.println("Turno de la maquina");
        System.out.println();

    }

    void mostrarRonda(int ronda){
        System.out.println("ronda numero " + ronda);

    }

    void sumarNumeros(int num, int num2){
        sumatorio = num + num2;
    }

    void mostrarSuma(){
        System.out.println("Resultado " + sumatorio);
        System.out.println();
    }

    void mostrarGanador(int jugador) {
        if (sumatorio % 2 == 0 && jugador == 1) {
            System.out.println("Gana humano");
            contador=contador+1;
            System.out.println("Humano " +  contador  + " VS Maquina " + contadorMaquina );

        } else if (sumatorio % 2 != 0 && jugador == 2) {
            System.out.println("Gana humano");
            contador=contador+1;
            System.out.println("Humano " +  contador  + " VS Maquina " + contadorMaquina );
        } else {
            System.out.println("gana maquina");
            contadorMaquina=contadorMaquina+1;
            System.out.println("Humano " +  contador  + " VS Maquina " + contadorMaquina );
        }
    }
}