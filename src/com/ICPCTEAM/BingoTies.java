package com.ICPCTEAM;

import java.util.HashSet;
import java.util.Scanner;

public class BingoTies {
    //Make it so two of the grids win at the same time
    //Make an array of array of hashsets -- for each row
    //Compare the new number being called and delete it from all of the hashsets.
    //If one hashset is zero... look and see if another is zero
        //If another is zero then return those two
        //If only one is zero return no pairs

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = s.nextInt();
        int rows = 5;
        while (!s.nextLine().equals("\n"))
            rows++;

        HashSet<Integer>[][] bingoCards = (HashSet<Integer>[][]) new HashSet<?>[total][rows];
        for (int i = total - 1; i > 0; i--) {
            for (int j = 0; j < rows - 1; j++) {
                bingoCards[i][j] = new HashSet<Integer>();

                for (int k = 0; k < rows - 1; k++) {
                    bingoCards[i][j].add(s.nextInt());
                }
            }

            while (s.next().equals("\n")) {
                //Nothing
            }

            if (i != 0) {
                s.next();
            }
        }

        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < rows - 1; j++) {

            }
        }



    }


}
