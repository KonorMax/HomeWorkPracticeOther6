package com.konor.HomeWorkPracticeOther6;

public class ArrayElementValuesTheSame {
    public static String sayYesOrNo(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        int[] array = {5, 5, 5, 5, 5, 5,};
        System.out.println(sayYesOrNo(array));
    }

}













