package ru.bondarev.java3.lesson1.hw1;

import java.util.ArrayList;
import java.util.Arrays;

public class HW1 {

    public static void main(String[] args) {
        HW1 hw = new HW1();

        // 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
        //2. Написать метод, который преобразует массив в ArrayList;

        String[] strings = {"First", "Second", "Third", "Fourth", "Five"};
        System.out.println(hw.convertArrayToList(strings)); // задача 2.
        hw.swapElements(0, 3, strings); // меняем местами элементы под номерами индекса 0 и 3 соответственно.
        System.out.println(Arrays.toString(strings));

        Integer[] integers = {1, 2, 3, 4, 5, 6};
        System.out.println(hw.convertArrayToList(integers)); // задача 2.
        hw.swapElements(0, 3, integers); // меняем местами элементы под номерами индекса 0 и 3 соответственно.
        System.out.println(Arrays.toString(integers));

        System.out.println("*****************************************");

        // 3. Большая задача:
        //Есть классы Fruit -> Apple, Orange (больше фруктов не надо);
        //Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
        // поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        //Для хранения фруктов внутри коробки можно использовать ArrayList;
        //3.1. Сделать метод getWeight(), который высчитывает вес коробки, зная количество фруктов (возьмём 3 фрукта) и
        // вес одного фрукта (вес яблока – 1.0f, апельсина – 1.5f. Не важно, в каких это единицах);
        //3.2. Внутри класса Коробка сделать метод compare, который позволяет сравнить текущую коробку с той,
        // которую подадут в compare в качестве параметра, true – если она равны по весу,
        // false – в противном случае (коробки с яблоками мы можем сравнивать с коробками с апельсинами);
        // 3.3. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую
        // (помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами).
        // Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
        //Не забываем про метод добавления фрукта в коробку.

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        for (int i = 0; i < 3; i++) {
            appleBox.add(new Apple());
            orangeBox.add(new Orange());
        }
        System.out.println("Коробка заполненная яблоками, с указанием веса - " + appleBox.getFruits());
        System.out.println("Коробка заполненная апельсинами, с указанием веса - " + orangeBox.getFruits());

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.add(new Apple());
        appleBox.moveAllToNextBox(appleBox1);
        System.out.println("Коробка из под яблок пустая - " + appleBox.getFruits());
        System.out.println("Коробка из под апельсинов заполненная яблоками, с указанием веса - " + appleBox1.getFruits() +
                " где первое яблоко в перечислении - яблоко из новой партии.");
    }

    // Метод, который меняет два элемента массива местами
    private <T> void swapElements(int idx1, int idx2, T[] array) {
        T tmp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = tmp;
    }

    // Метод, который преобразует массив в ArrayList;
    private <T> ArrayList<T> convertArrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
