package com.konor.HomeWorkPracticeOther6;

public class EvenElementsArrayFibonacci {
    public static void main(String[] args) {

        int[] Array = new int[15];

        for (int i = 0; i < Array.length; i++) {
            if (i < 2) {
                Array[i] = 1;
            } else {
                Array[i] = Array[i - 2] + Array[i - 1];
            }
            if (Array[i] % 2 == 0) {
                System.out.print(Array[i] + " ");
            }

        }
    }
}



