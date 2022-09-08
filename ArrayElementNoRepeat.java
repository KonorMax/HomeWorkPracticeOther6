package com.konor.HomeWorkPracticeOther6;

public class ArrayElementNoRepeat {
    public static String sayYesOrNo(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                if (array[i] == array[j] && i != j) {
                    return "NO";
                }
        }
        return "YES";
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        System.out.println(sayYesOrNo(array));
    }
}
