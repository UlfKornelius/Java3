package ru.bondarev.java3.lesson6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HW6Test {
    private final HW6 hw = new HW6();

    @Test
    void getNumberAfterLastFour() {
                System.out.println("1.1. Возвращает массив состоящий из цифр после последней 4: " + Arrays.toString(hw.getNumberAfterLastFour(
                new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7})));
                System.out.println("1.2. Возвращает массив состоящий из цифр после последней 4: " + Arrays.toString(hw.getNumberAfterLastFour(
                new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7, 12})));
                System.out.println("1.3. Возвращает массив состоящий из цифр после последней 4: " + Arrays.toString(hw.getNumberAfterLastFour(
                        new int[]{1, 2, 4, 4})));
    }

    @Test
    void validateArrayByOneAndFour() {
        System.out.println("2.1. Проверка для массива состоящего из 1 и 4: " +
                hw.validateArrayByOneAndFour(new int[]{1, 4, 4, 4, 1, 4}));
        System.out.println("2.2. Проверка для массива состоящего из цифр и если присутствует хоть одна цифра 1 или 4 то true: " +
                hw.validateArrayByOneAndFour(new int[]{4, 6, 5}));
        System.out.println("2.3. Проверка для массива состоящего из цифр и если присутствует хоть одна цифра 1 или 4 то true: " +
                hw.validateArrayByOneAndFour(new int[]{1, 6, 32}));
        System.out.println("2.4. Проверка для массива состоящего из цифр и если присутствует хоть одна цифра 1 или 4 то true: " +
                hw.validateArrayByOneAndFour(new int[]{7, 6, 32}));
    }
}