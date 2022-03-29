package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
/*        String a = "Ala ma kota!";

        // Tablice indeksujemy od 0
        String[] b = new String[3];
        b[0] = "Ala";
        b[1] = "ma";
        b[2] = "kota!";

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println();
        System.out.println("Dlugosc tablicy: " + b.length);
        b[2] += " Ale ma tez aids!";

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        String[] miesiace = {"Styczen", "Luty", "Marzec", "Kwiecien"};
        System.out.println(miesiace.length);

        int z = 0;
        while (z < miesiace.length) {
            System.out.println(miesiace[z] + " ");
            z++;
        }*/

        /*
        1. Zadeklaruj tablice intów (dwoma sposobami)
        2. Przypisz do nich wartosci, wypisz ich dlugosc i wybrane elementy
        3. Wyswietl cala tablice
        4. Wyswietl liczby wieksze niz 4
        5. Policz sume elementow tablicy
        6. Znajdz element najwiekszy

        Do domu
        7. Znajdz element najmniejszy
        8. Posortuj tablice -> bubble sort (sortowanie bąbelkowe)
        9. n = 5

           uwaga -> nie da sie wyswietlic klepsydry dla nieparzystej liczby n gdzie n wczytane przez uzytkownika
           z klawiatury i oznacza wysokosc klepsydry
         */

      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokosc klepsydry: ");
        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < a / 2; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int b = 0; b < a - (i + 1) * 2; b++) {
                System.out.print("*");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = a / 2 - 2; i >= 0; i--) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int b = 0; b < a - (i + 1) * 2; b++) {
                System.out.print("*");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = a; i > 0; i--) {
            System.out.print("*");
        }*/

        //ZADANKO DOMOWE!!

        // 1.)

        /*Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj wysokosc trojkata: ");
        int b = scanner2.nextInt();

        for (int i = 1; i <= b; i++) {
            for (int j = (b - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int c = 1; c <= (i * 2) - 1; c++) {
                System.out.print("*");
            }
            System.out.println();*/

        // 2.)

      /*  Scanner scanner3 = new Scanner(System.in);
        System.out.println("Podaj wysokosc trojkata liczbowego: ");
        int b = scanner3.nextInt();

        for (int i = 1; i <= b; i++) {
            for (int j = (b - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int c = 1; c <= (i * 2) - 1; c++) {
                System.out.print("" + i);
            }
            System.out.println();
            */


   /*     Scanner sc = new Scanner(System.in);
        System.out.print("Podaj wysokosc mieszanego trojkata:");
        int rows = sc.nextInt();
        System.out.println("");
        for (int i = 1; i <= rows; i++) {//outer forloop
            for (int j = 1; j <= (rows - i) * 2; j++) {
                System.out.print(" ");//create initial space for pyramid shape
            }
            for (int k = i; k >= 1; k--) {//inner for loops
                System.out.print(" " + k);//create left half
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(" " + l);    //create right half
            }//end outer for loop
            System.out.println();*/


        // CTRL SHIFT /


        /*nt[] s = new int[5];
        s[0] = 11;
        s[1] = 2;
        s[2] = 7;
        s[3] = 4;
        s[4] = 5;

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }

        int[] inty = {6, 7, 8, 9, 10};
        System.out.println(s.length);
        int d = 0;
        while (d < s.length) {
            System.out.print(s[d] + " ");
            d++;
        }
        System.out.println();
        for (int i = 0; i < s.length; i++) {
            if (s[i] > 4) {
                System.out.print(s[i] + " ");
            }
        }
        System.out.println();

        int suma = 0;

        for (int i = 0; i < s.length; i++) {
            suma = suma + s[i];
        }
        *//*
        1it: i = 0, suma = 0 WP suma = 0 + 0 = 0
        2it: i = 1, suma = 0 WP suma = 0 + 1 = 1
        3it  i = 2, suma = 1 WP suma = 1 + 2 = 3
         *//*

        System.out.println(suma);
        int max = 0;


        for (int i = 0; i < s.length; i++) {
            if (s[i] > max) {
                max = s[i];
            }
        }

        System.out.println("Maksymalna liczba to: " + max);

        // System.out.println(b[3]); -> błąd, ponieważ nie ma elementu b[3] w tablicy

        System.out.println();
        //ZADANKA!

        // 7. Znajdz element najmniejszy
//        int[] s = new int[5];
//        s[0] = 11;
//        s[1] = 2;
//        s[2] = 7;
//        s[3] = 4;
//        s[4] = 5;

        int min = 0;
        for (int i = 0; i < s.length; i++) {
            if (i == 0) {
                min = s[i];
            } else if (s[i] < min) {
                min = s[i];
            }
        }
        System.out.println("Minimalna liczba to: " + min);

        System.out.println();*/

        //8. Posortuj tablice -> bubble sort (sortowanie bąbelkowe)
    /*            int[] numerki = {5, 4, 3, 2, 1, 6, 7, 10};
                System.out.println(Arrays.toString(sort(numerki)));
            }

            private static int[] sort ( int[] numerki){
                boolean zmiana = false;
                for (int index = 0; index < numerki.length - 1; index++) {
                    int obecnaLiczba = numerki[index];
                    int kolejnaLiczba = numerki[index + 1];
                    if (obecnaLiczba > kolejnaLiczba) {
                        numerki[index] = kolejnaLiczba;
                        numerki[index + 1] = obecnaLiczba;
                        zmiana = true;
                    }
                }
                return zmiana ? sort(numerki) : numerki;
            }
        }

        */
        /*
              3. Write a Java program to convert an ArrayList to an array.
              4. Write a Java program to find the second smallest element in an array.
              5. Write a Java program to find the second largest element in an array.
              6. Write a Java program to remove duplicate elements from an array.
              7. Write a Java program to find the common elements between two arrays of
                 integers.
              8. Write a Java program to find the common elements between two arrays
                 (string values).
              9. Write a Java program to find the duplicate values of an array of string
                 values.
              10.Write a Java program to find the duplicate values of an array of integer
                 values.
              11.Write a Java program to reverse an array of integer values.
              12.Write a Java program to find the maximum and minimum value of an
                 array.
              13.Write a Java program to insert an element (specific position) into an array.*/

        //Write a Java program to test the equality of two arrays.

        int[] d = {1, 2, 3, 4};
        int[] f = {1, 2, 3, 5};
        boolean result = Arrays.equals(d, f);
        if (result == true) {
            System.out.println("Two arrays are equal ");
        } else {
            System.out.println("Two arrays are not equal ");
        }
        // 3. Write a Java program to convert an ArrayList to an array.


            }
        }









    }
}



