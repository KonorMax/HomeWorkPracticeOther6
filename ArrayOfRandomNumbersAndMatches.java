package com.konor.HomeWorkPracticeOther6;

import java.util.Random;

public class ArrayOfRandomNumbersAndMatches {
    public static void main(String[] args) {

        Random random = new Random();
        int numb =0;
        int counter =0;
        int repeat =0 ;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-10, 10);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            counter = 1;
            for (int j = i + 1; j < array.length; j++) {
                numb = array[i];

                if (array[i] == array[j] && (j != i)) {
                    counter++;
                }
            }
             if ((repeat <= counter) && (counter!= 1)) {

                repeat = counter;

                System.out.println();
                System.out.print("Число " + numb + " - " + repeat + " раза");
            }
        }
    }
}
