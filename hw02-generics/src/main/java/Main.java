import java.util.Comparator;

public class Main {

    public static void main(String args[])  {

        DIYarrayList<Fruit> fruits = new DIYarrayList<Fruit>();

        DIYarrayList<Fruit> basket = new DIYarrayList<Fruit>();

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

        Fruit strawberry = new Fruit("strawberry");
        Fruit cherry = new Fruit("cherry");

        fruits.add(apple);
        fruits.add(orange);
        fruits.add(lemon);
        fruits.add(banana);
        fruits.add(apricot);

        basket.addAll(fruits, strawberry, cherry);

        basket.copy(fruits, basket);

        fruits.sort(basket, Fruit.Comparators.NAME);

        fruits.contains(cherry);
    }

    private static class Fruit {
        String name;
        public Fruit(String name) {
            this.name = name;
        }

        public static class Comparators {

            public static Comparator<Fruit> NAME = new Comparator<Fruit>() {
                @Override
                public int compare(Fruit fruit1, Fruit fruit2) {
                    return fruit1.name.compareTo(fruit2.name);
                }
            };
        }

    }

}
