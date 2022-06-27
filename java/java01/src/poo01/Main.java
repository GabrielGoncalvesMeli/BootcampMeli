package poo01;

public class Main {
    public static void main(String[] args) {
        Person randomPerson = new Person();
        Person gabriel = new Person("Gabriel", 24, "5658897");
        Person fernando = new Person("Fernando", 22, "24568654", 70.45, 1.78);

        String fernandoImc = fernando.imcCalculate() == -1 ? "Under Weight"
                : (fernando.imcCalculate() == 0 ? "Healthy weight" : "overweight");

        boolean isFernandoOfAge = fernando.isOfAge();

        System.out.println(fernando.getName() + " is " + fernandoImc);
        System.out.println("Is " + fernando.getName() + " of age: " + isFernandoOfAge);
        System.out.println();
        System.out.println(fernando);
    }
}
