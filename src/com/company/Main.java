package com.company;

import java.math.BigInteger;
import java.util.Scanner;



public class Main {
    private static BigInteger TWO = BigInteger.valueOf(2);

    public static BigInteger fibonacci(BigInteger i)
    {
        if (i.equals(BigInteger.ZERO) || i.equals(BigInteger.ONE)) { // Przypadki bazowe
        return i;
        }
         else { // Krok rekurencyjny
         return fibonacci(i.subtract(BigInteger.ONE)).add(fibonacci(i.subtract(TWO)));
         }
    }

    public static void main(String[] args) {
        System.out.println("Wpisz liczbę całkowitą: ");
        Scanner input = new Scanner(System.in);
        int fibNumb = input.nextInt();

        for (int i = 0; i <= fibNumb; i++){
            System.out.printf("Element %d. ciągu Fibonacciego to: %d%n",
                    i,fibonacci(BigInteger.valueOf(i)));
        }



    }
}
