package poo02;

public class Pereciveis extends Product{
    private int daysToExpire;

    public int getDaysToExpire() {
        return daysToExpire;
    }

    public void setDaysToExpire(int daysToExpire) {
        this.daysToExpire = daysToExpire;
    }

    public Pereciveis(String name, double price ,int daysToExpire) {
        super(name, price);
        this.daysToExpire = daysToExpire;
    }

//    @Override
//    public String toString() {
//
//    }

    @Override
    public double calculate(int quantity){
        double finalPrice;
        switch (daysToExpire) {
            case 1:
                finalPrice = (this.getPrice() * quantity) / 4;
                break;
            case 2:
                finalPrice = (this.getPrice() * quantity) / 3;
                break;
            case 3:
                finalPrice = (this.getPrice() * quantity) / 2;
                break;
            default:
                finalPrice = this.getPrice() * quantity;
        }
        return finalPrice;
    }
}
