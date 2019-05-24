package com.company;
import java.util.Scanner;

public class Jugador {
    int decision;
    int numero;

    Scanner sc = new Scanner(System.in);


    void decidir(){
        decision = sc.nextInt();
    }

    void pedirDecision(){
        System.out.println("Turno del jugador, Pares o Nones ?");
        System.out.println();
        System.out.println("Pares = 1 , Nones = 2");
        System.out.println();
    }

    void numero(){
        numero = sc.nextInt();
    }
}