package com.konor.HomeWorkPracticeOther6;

import java.util.Random;

public class MinMaxNumArray {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-70, 50);
            System.out.print(arr[i] + " ");
        }

        int numMin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < numMin)
                numMin = arr[i];
        }
        int numMax = arr[29];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > numMax)
                numMax = arr[i];

        }
        System.out.println();
        System.out.println("Minimal number: " + numMin);
        System.out.println("Max number: " + numMax);
    }
}


