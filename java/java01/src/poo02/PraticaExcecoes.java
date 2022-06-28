package poo02;

public class PraticaExcecoes {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        try {
            if(a == 0) throw new IllegalArgumentException();
            double result = b/a;
        } catch (IllegalArgumentException e) {
            System.out.println("Can't divide by zero");
        } catch (Exception e) {
            System.out.println("An error has occurred");
        }
        finally {
            System.out.println("Program finished");
        }
    }

}
