package aulas.heranca;

public class Cachorro extends Animal {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Cachorro(double height, double weight, int legsNumbers, String name) {
        super(height, weight, legsNumbers);
        this.name = name;
    }

    public String latir() {
        return "Au au";
    }

    @Override
    public String showInfos() {
        return "This is a dog, its weight is " +  super.getHeight() + " and his weight is " + this.getWeight() + " and its name is " + this.name;
    }
}
