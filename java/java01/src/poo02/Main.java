package poo02;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Pereciveis("potato", 0.35, 2);
        products[1] = new Pereciveis("chicken", 10.35, 5);
        products[2] = new NaoPereciveis("Beans", 3.52, "one");
        products[3] = new NaoPereciveis("Rice", 7.20, "three");
        products[4] = new NaoPereciveis("Salmon", 35.52, "five");

        System.out.println(products[0].calculate(1));
        System.out.println(products[1].calculate(1));
        System.out.println(products[2].calculate(2));
        System.out.println(products[3].calculate(2));
        System.out.println(products[4].calculate(2));

    }
}
