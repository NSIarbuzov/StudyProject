package maxMinAvg;

import java.util.Arrays;

public class MaxMinAvg {
    public static void main(String[] args) {
        int a = 0;
        int b = 100;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * (b - a)) + a;
            System.out.print(array[i] + " ");

        }

        int min = array[0];
        int max = array[0];
        int avg = 0;

        for (int i = a; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            if (array[i] > max)
                max = array[i];


        }
        int sum = Arrays.stream(array).sum();
        avg = sum / array.length;

        System.out.println("sum = " + sum);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);

    }
}