package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dividend;
        int divisor;
        int ergebnis;
        int rest;

        System.out.println("Divisionsrechner");
        System.out.println("Bitte geben Sie den Dividenden ein:");
        dividend = sc.nextInt();
        System.out.println("Bitte geben Sie den Divisor ein:");
        divisor = sc.nextInt();
        ergebnis = dividend / divisor;
        rest = dividend % divisor;
        System.out.println("Das Ergebnis ist: " + ergebnis + " mit " + rest + " Rest");

    }
}
