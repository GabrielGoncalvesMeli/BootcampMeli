package poo02;

public class NaoPereciveis extends Product{
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NaoPereciveis(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

}
