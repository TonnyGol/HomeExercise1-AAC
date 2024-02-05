import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Starting point
        // We will write the code
        // all together
    }

    public static int getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        return scanner.nextInt();
    }

    // Case 7

    public static void printAllPrimeNumbersInRange(){
        System.out.println("Prime numbers in range selected,");
        System.out.println("2 numbers required for range. ");
        int start = getInput();
        int end = getInput();
        printPrimeNumbersInRange(start, end);
    }
    public static void printPrimeNumbersInRange(int start, int end){
        boolean foundPrime = false;
        for (int i = start; i<= end; i++){
            if (checkIfPrimeNumber(i)){
                System.out.print(i + ", ");
                foundPrime = true;
            }
        }
        if (!foundPrime){
            System.out.println("No Prime numbers found in range. ");
        }
    }

    public static boolean checkIfPrimeNumber(int number){
        boolean isPrimeNumber = false;
        for (int i = 1; i<=number; i++){
            if (number % i == 0){
                if (i == 1 || i == number){
                    isPrimeNumber = true;
                } else {
                    isPrimeNumber = false;
                    break;
                }
            }
        }
        return isPrimeNumber;
    }

    // Case 8

    public static void calculate2NumbersGCD(){
        System.out.println("Find GCD selected,");
        System.out.println("2 numbers required for GCD.");
        int num1 = getInput();
        int num2 = getInput();
        if(num1>num2) {
            System.out.println("The GCD is: " + findGCDFor2Numbers(num2, num1));
        } else {
            System.out.println("The GCD is: " + findGCDFor2Numbers(num1, num2));
        }
    }
    public static int findGCDFor2Numbers(int smallerNum, int biggerNum){
        int currentGCD = 1;
        for (int i = 1; i<=biggerNum; i++){
            if ((biggerNum % i == 0) && (smallerNum % i == 0)){
                currentGCD = i;
            }
            if (i == smallerNum){
                break;
            }
        }
        return currentGCD;
    }

    // Case 9

    public static void calculateQuadraticEquation(){
        System.out.println("Quadratic Equation calculation selected,");
        int a, b, c;
        System.out.println("Number for a: ");
        a = getInput();
        System.out.println("Number for b: ");
        b = getInput();
        System.out.println("Number for c: ");
        c = getInput();
        calculateQuadraticEquation(a, b, c);
    }

    public static void calculateQuadraticEquation(int a, int b, int c) {
        double discriminant = (b * b) - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("No real solution for equation.");
        } else {
            double x1 = (-1 * b + Math.sqrt(discriminant)) / (2 * a);
            if (discriminant == 0) {
                System.out.println("X1, X2 = " + x1);
            } else {
                double x2 = (-1 * b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            }
        }
    }

    // TO DO: funcEx1, funcEx2, funcEx3
    //        funcEx4, funcEx5, funcEx6
    //        funcEx7, funcEx8, funcEx9
    //        funcEx10, funcEx11, funcEx12

}
