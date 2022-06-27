package arrays;

public class Java01Pratica01 {
    public static void main(String[] args) {
        String[] cities = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción",
                "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};

        int [][] temperatures = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};


        int higherTemperature = temperatures[0][0];
        int lowerTemperature = temperatures[0][0];
        int higherPosition = 0;
        int lowerPosition = 0;

        for (int i = 0; i < 10; i++) {
                if(temperatures[i][1] > higherTemperature) {
                    higherTemperature = temperatures[i][1];
                    higherPosition = i;
                }
                if(temperatures[i][0] < lowerTemperature) {
                    lowerTemperature = temperatures[i][0];
                    lowerPosition = i;
                }
        }

        System.out.println("The lower temperature is in " + cities[lowerPosition] + " with " + lowerTemperature + "º");
        System.out.println("The higher temperature is in " + cities[higherPosition] + " with " + higherTemperature + "º");

    }
}
