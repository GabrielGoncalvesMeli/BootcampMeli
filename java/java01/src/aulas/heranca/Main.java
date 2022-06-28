package aulas.heranca;

public class Main {
    public static void main(String[] args) {
        Cachorro doguito = new Cachorro(0.4, 20, 4, "doguito");
        System.out.println(doguito.showInfos());
        System.out.println();
        System.out.println(doguito.latir());
    }
}
