package aulas.heranca;

public class Animal {
    private double height;
    private double weight;
    private int legsNumbers;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLegsNumbers() {
        return legsNumbers;
    }

    public void setLegsNumbers(int legsNumbers) {
        this.legsNumbers = legsNumbers;
    }

    public Animal(double height, double weight, int legsNumbers) {
        this.height = height;
        this.weight = weight;
        this.legsNumbers = legsNumbers;
    }

    public String showInfos() {
        return "This is an animal, its weight is " + this.height + " and his weight is " + this.weight;
    }

}
