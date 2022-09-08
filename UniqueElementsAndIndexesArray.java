package com.konor.HomeWorkPracticeOther6;

import java.util.Random;

public class UniqueElementsAndIndexesArray {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-10, 10);
            System.out.print(array[i] + ", ");
        }
        for (int i = 0; i < array.length; i++) {
            boolean bl = true;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    bl = false;
                    break;
                }
            }
            if (bl) {
                System.out.print( "Unique element: " + array[i] + ", \n" + " ");
            }
        }
    }
}
