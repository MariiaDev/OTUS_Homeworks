package ru.otus.homework;

import ru.otus.homework.arrayListClass.DIYarrayList;

import java.util.Collections;
import java.util.Comparator;

public class Main  {

    public static void main(String args[])  {

        DIYarrayList<Fruit> fruits = new DIYarrayList();

        DIYarrayList<Fruit> basket = new DIYarrayList();

        Fruit apple = new Fruit("apple");
        Fruit orange = new Fruit("orange");
        Fruit lemon = new Fruit("lemon");
        Fruit banana = new Fruit("banana");
        Fruit watermelon = new Fruit("watermelon");
        Fruit mango = new Fruit("mango");
        Fruit apricot = new Fruit("apricot");
        Fruit nectarine = new Fruit("nectarine");
        Fruit pear = new Fruit("pear");
        Fruit grape = new Fruit("grape");
        Fruit kiwi = new Fruit("kiwi");

        Fruit apple1 = new Fruit("apple");
        Fruit orange1 = new Fruit("orange");
        Fruit lemon1 = new Fruit("lemon");
        Fruit banana1 = new Fruit("banana");
        Fruit watermelon1 = new Fruit("watermelon");
        Fruit mango1 = new Fruit("mango");
        Fruit apricot1 = new Fruit("apricot");
        Fruit nectarine1 = new Fruit("nectarine");
        Fruit pear1 = new Fruit("pear");
        Fruit grape1 = new Fruit("grape");
        Fruit kiwi1 = new Fruit("kiwi");

        Fruit apple2 = new Fruit("apple");
        Fruit orange2 = new Fruit("orange");
        Fruit lemon2 = new Fruit("lemon");
        Fruit banana2 = new Fruit("banana");
        Fruit watermelon2 = new Fruit("watermelon");
        Fruit mango2 = new Fruit("mango");
        Fruit apricot2 = new Fruit("apricot");
        Fruit nectarine2 = new Fruit("nectarine");
        Fruit pear2 = new Fruit("pear");
        Fruit grape2 = new Fruit("grape");
        Fruit kiwi2 = new Fruit("kiwi");

        Fruit strawberry = new Fruit("strawberry");
        Fruit cherry = new Fruit("cherry");

        Fruit ananas = new Fruit("ananas");

        fruits.add(apple);
        fruits.add(orange);
        fruits.add(lemon);
        fruits.add(banana);
        fruits.add(apricot);
        fruits.add(watermelon);
        fruits.add(mango);
        fruits.add(nectarine);
        fruits.add(pear);
        fruits.add(grape);
        fruits.add(kiwi);

        fruits.add(apple1);
        fruits.add(orange1);
        fruits.add(lemon1);
        fruits.add(banana1);
        fruits.add(apricot1);
        fruits.add(watermelon1);
        fruits.add(mango1);
        fruits.add(nectarine1);
        fruits.add(pear1);
        fruits.add(grape1);
        fruits.add(kiwi1);

        fruits.add(apple2);
        fruits.add(orange2);
        fruits.add(lemon2);
        fruits.add(banana2);
        fruits.add(apricot2);
        fruits.add(watermelon2);
        fruits.add(mango2);
        fruits.add(nectarine2);
        fruits.add(pear2);
        fruits.add(grape2);
        fruits.add(kiwi2);

        basket.add(ananas);

        /*
        Проверить, что на ней работают методы из java.util.Collections:
        Collections.addAll(Collection<? super T> c, T... elements)
        Collections.static <T> void copy(List<? super T> dest, List<? extends T> src)
        Collections.static <T> void sort(List<T> list, Comparator<? super T> c)
        */

        Collections.addAll(fruits, strawberry, cherry);

        Collections.copy(fruits, basket);

        Collections.sort(fruits, Fruit.Comparators.NAME);

    }

    private static class Fruit implements Comparator<Fruit> {
        String name;
        public Fruit(String name) {
            this.name = name;
        }

        @Override
        public int compare(Fruit o1, Fruit o2) {
            return 0;
        }

        public static class Comparators {

            public static Comparator<Fruit> NAME = Comparator.comparing(fruit -> fruit.name);
        }
    }

}
