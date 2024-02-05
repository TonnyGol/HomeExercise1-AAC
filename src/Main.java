import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Starting point
        // We will write the code
        // all together
    }

    // TO DO: funcEx1, funcEx2, funcEx3
    //        funcEx4, funcEx5, funcEx6
    //        funcEx7(V), funcEx8(V), funcEx9(V)
    //        funcEx10(V), funcEx11(V), funcEx12(V)
    // Tonny added function 10, 11, 12
    // Daniel_D added function 7, 8, 9

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



    public static void print_CompoundInterest(int investment, int interest){
        final int FULL_YEAR = 12;
        final int FULL_3_YEARS = 36;
        float halfAmountInvestment;
        float newInvestment = investment;

        for(int i=1; i<=FULL_3_YEARS; i++){
            newInvestment += (newInvestment * interest * 0.01F);
            if(i % FULL_YEAR == 0){
                System.out.println(i+" months amount: "+newInvestment);
            } else if (i % 3 == 0) {
                halfAmountInvestment = newInvestment - ((newInvestment - investment) * 0.5F);
                System.out.println(i+" months amount: "+ halfAmountInvestment);
            }
        }

    } // Func_EX10 Finished (V)

    //------------------------------------------------------------------------------------------------------------------

    public static boolean checkIfPartOfFibonacciSeries(int number){
        boolean isPartOfFibonacciSeries = false;
        int fibonacciNum = 0;
        int tempNum1 = 0;
        int tempNum2 = 1;

        while (fibonacciNum < number){
            fibonacciNum = tempNum1 + tempNum2;
            tempNum1 = tempNum2;
            tempNum2 = fibonacciNum;
            if (fibonacciNum == number){
                isPartOfFibonacciSeries = true;
                break;
            }
        }
        return isPartOfFibonacciSeries;
    } // Func_EX11 Finished (V)

    //------------------------------------------------------------------------------------------------------------------

    public static void printMostClosestNarcissisticNumber(int number){
        int closeNarcissistNumber1 = number;
        int closeNarcissistNumber2 = number;
        int mostCloseNarcissistNumber;

        if(checkNarcissisticNumber(number)){
            System.out.println("Closest Narcissistic number: "+number);
        } else{
            while (!checkNarcissisticNumber(closeNarcissistNumber1)){
                closeNarcissistNumber1++;
            }
            while (!checkNarcissisticNumber(closeNarcissistNumber2)){
                closeNarcissistNumber2--;
            }


            if((number - closeNarcissistNumber2) * -1 < number - closeNarcissistNumber1){
                mostCloseNarcissistNumber = closeNarcissistNumber1;
                System.out.println("Closest Narcissistic number: "+mostCloseNarcissistNumber);
            }else {
                mostCloseNarcissistNumber = closeNarcissistNumber2;
                System.out.println("Closest Narcissistic number: "+mostCloseNarcissistNumber);
            }
        }
    } // Func_EX12 Finished (V)
    public static boolean checkNarcissisticNumber(int number){
        int lengthOfNumber;
        double sumOfNumsToPowerOfNumbersCount;
        lengthOfNumber = getLengthOfNumber(number);
        sumOfNumsToPowerOfNumbersCount = getCalculationOfNumsInPowerOfNumbersLength(number, lengthOfNumber);
        return number == sumOfNumsToPowerOfNumbersCount;
    } // (*)A Function to help Function of EX12
    public static int getLengthOfNumber(int number){
        int numbersCountInNum = 0;
        while (number > 0){
            numbersCountInNum++;
            number = number / 10;
        }
        return numbersCountInNum;
    } // (*)A Function to help Function ( checkNarcissisticNumber() ↑)
    public static double getCalculationOfNumsInPowerOfNumbersLength(int number, int numbersCountInNum){
        double sumOfNumsToPowerOfNumbersCount = 0;
        while (number > 0){
            sumOfNumsToPowerOfNumbersCount += Math.pow(number % 10, numbersCountInNum);
            number = number / 10;
        }
        return sumOfNumsToPowerOfNumbersCount;
    } // (*)A Function to help Function ( checkNarcissisticNumber() ↑)

}
