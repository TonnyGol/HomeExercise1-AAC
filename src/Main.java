import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Starting point
        // We will write the code
        // all together
    }
     //34
    // TO DO: funcEx1, funcEx2, funcEx3
    //        funcEx4, funcEx5, funcEx6
    //        funcEx7, funcEx8, funcEx9
    //        funcEx10, funcEx11, funcEx12
    public static void Circle(Scanner scanner) {
        System.out.println("Enter radius");
        float radius = scanner.nextFloat();
        float S = (float) (Math.PI * Math.pow(radius, 2));
        float P = (float) (2 * Math.PI * radius);
        System.out.println("The area is" + S);
        System.out.println("The perimeter is" + P);
    }
    public static void Temperature(Scanner scanner) {
        System.out.println("Enter temperature type: Celsius or Fahrenheit");
        String temperatureType = scanner.next();
        System.out.println("Enter temperature");
        float temperature = scanner.nextFloat();
        if (temperatureType.equals("Celsius")) {
            temperature = (float) (temperature * 33.8);
            System.out.println("The temperature in Fahrenheit is " + temperature);
        } else {
            temperature = (float) (temperature / 33.8);
            System.out.println("The temperature in Celsius is " + temperature);
        }
    }

    public static void Factorial(Scanner scanner) {
        int num = 0;
        while (num <= 0) {
            System.out.println("Enter a positive number");
            num = scanner.nextInt();
        }
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.println("The factorial is " + result);
    }
}
