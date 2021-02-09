package ru.bondarev.java3.lesson6;



public class HW6 {

        int[] getNumberAfterLastFour(int[] array) throws RuntimeException {
        for (int i = array.length - 1; i >= 0; i--)
            if (array[i] == 4) {
                int idx = i + 1;
                int[] result = new int[array.length - idx];
                System.arraycopy(array, idx, result, 0, result.length);
                return result;
            }
        throw new RuntimeException("There are no numbers 4");
    }

    boolean validateArrayByOneAndFour(int[] array) {
        boolean containsOne = false;
        boolean containsFour = false;
        for (int i : array)
            if (i == 1)
                containsOne = true;
            else if (i == 4)
                containsFour = true;

        return containsOne || containsFour;
    }
}