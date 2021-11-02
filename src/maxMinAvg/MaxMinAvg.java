package maxMinAvg;

public class MaxMinAvg {
    public static void main(String[] args) {
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();

        }

        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (double v : array) {
            if (max < v)
                max = v;
            if (min > v)
                min = v;
            avg += v / array.length;
        }

        System.out.println("max = " + String.format("%.2f", max));
        System.out.println("min = " + String.format("%.2f", min));
        System.out.println("avg = " + String.format("%.2f", avg));
        System.out.println("HI!");

    }
}