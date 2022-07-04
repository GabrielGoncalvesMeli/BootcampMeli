package poo04.supermercado01;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Cliente julia = new Cliente(1, "julia", "heberle");
        Cliente paulo = new Cliente(2, "paulo", "santos");
        Cliente felipe = new Cliente(3, "felipe", "ferreira");

        HashMap<Integer, Cliente> myMap = new HashMap<Integer, Cliente>() {{
            put(julia.getId(), julia);
            put(paulo.getId(), paulo);
            put(felipe.getId(), felipe);
        }};

        myMap.forEach((key,value) -> {
            System.out.println(value);
        });

        myMap.remove(julia.getId());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o id:");
        int teclado = scanner.nextInt();
        System.out.println(myMap.get(teclado));


        // *************** PARTE II *********************


    }
}
