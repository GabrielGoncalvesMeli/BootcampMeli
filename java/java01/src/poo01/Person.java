package poo01;

public class Person {
    private String name;
    private int age;
    private String id;
    private double weight;
    private double height;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public Person() {

    }

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Person(String name, int age, String id, double weight, double height) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.weight = weight;
        this.height = height;
    }

    public int imcCalculate() {
        double imc = (this.weight / (Math.pow(this.height, 2)));

        if(imc < 20) return -1;
        if(imc >= 20 && imc <= 25) return 0;
        return 1;
    }

    public boolean isOfAge() {
        if(this.age > 18) return true;
        return false;
    }

    @Override
    public String toString() {
        String allInfos = ("Name: " + name + "\nAge: " + age + "\nID: " + id +  "\nWeight: " + weight + "\nHeight: " + height);
        return allInfos;
    }

}
