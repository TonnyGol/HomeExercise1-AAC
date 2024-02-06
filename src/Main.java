import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userInput;
        do{
            printMenu();
            userInput = getIntInput();
            switch (userInput){
                case 0 -> System.out.println("Goodbye :)");
                case 1 -> calculate_Circle_AreaAndPerimeter();
                case 2 -> convertBetween_CelsiusOrFahrenheit();
                case 3 ->factorialCalculation();
                case 4 -> System.out.println("Not Working Yet.");
                case 5 -> System.out.println("Not Working Yet.");
                case 6 -> System.out.println("Not Working Yet.");
                case 7 -> printAllPrimeNumbersInRange();
                case 8 -> print2NumbersGCD();
                case 9 -> printQuadraticEquationCalculation();
                case 10 -> print_CompoundInterest();
                case 11 -> checkIfPartOfFibonacciSeries();
                case 12 -> printMostClosestNarcissisticNumber();
                default -> System.out.println("Error, you have entered wrong input.");
            }
        }while (userInput != 0);
    }
    // TO DO: Check Functions 4,5,6

    // Checked Functions 1,2,3 / 7,8,9 / 10,11,12 (Names, functionality, Duplicate code....)
    // Added function doPowCalculation() to EX12

    public static int getIntInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        return scanner.nextInt();
    }
    public static float getFloatInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        return scanner.nextFloat();
    }

    //------------------------------------------------------------------------------------------------------------------

    public static void printMenu(){
        System.out.println("--------------------------------------");
        System.out.println("0. End run");
        System.out.println("1. Calculate Rectangles Area and Scope");
        System.out.println("2. Calculate Celsius or Fahrenheit inversion (c->f, f->c)");
        System.out.println("3. Print Assembly of a number");
        System.out.println("4. Print sum of numbers in range");
        System.out.println("5. Print if a number is Primary or not");
        System.out.println("6. Print if a number is Palindrome or not");
        System.out.println("7. Print Primary numbers in range");
        System.out.println("8. Calculate GCD of 2 numbers");
        System.out.println("9. Calculate Quadratic Equation (ax^2 + bx + c)");
        System.out.println("10. Calculate Compound Interest");
        System.out.println("11. Check if a number is part of Fibonacci series");
        System.out.println("12. Print Narcissistic number");
        System.out.println("--------------------------------------");
    }

    //------------------------------------------------------------------------------------------------------------------

    public static void calculate_Circle_AreaAndPerimeter() {
        System.out.println("Circle calculation selected - radius required,");
        float radius = getFloatInput();
        float area = (float) (3.14 * (radius * radius));
        float perimeter = (float) (2 * 3.14 * radius);
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);
    } // Func_EX1

    //------------------------------------------------------------------------------------------------------------------

    public static void convertBetween_CelsiusOrFahrenheit() {
        System.out.println("Enter temperature type - Celsius (1) or Fahrenheit (2)");
        int temperatureType = getIntInput();
        System.out.println("Enter temperature");
        float temperature = getIntInput();
        if (temperatureType == 1) {
            temperature = (temperature * 1.8F) + 32;
            System.out.println("The temperature in Fahrenheit is: " + temperature);
        } else {
            temperature = (temperature - 32)/1.8F;
            System.out.println("The temperature in Celsius is: " + temperature);
        }
    } // Func_EX2

    //------------------------------------------------------------------------------------------------------------------

    public static void factorialCalculation() {
        int num = 0;
        while (num <= 0) {
            System.out.println("Enter a positive number,");
            num = getIntInput();
        }
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.println("The factorial is: " + result);
    } // Func_EX3

    //------------------------------------------------------------------------------------------------------------------

    public static void naturalNumbers(int naturalNumber1, int naturalNumber2) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (naturalNumber1 == naturalNumber2) {
            System.out.println("Error, Please enter a new number");
            naturalNumber1 = scanner.nextInt();
            naturalNumber2 = scanner.nextInt();
        }
        for (int i = naturalNumber1; i <= naturalNumber2; i++) {             // does not print if I give the function 10, 5
            sum = sum + i;
        }
        System.out.println(sum);
    }
    public static boolean prime(int firstNumber) {
        Scanner scanner = new Scanner(System.in);
        boolean prime = true;
        int count = firstNumber;
        while (count == 1) {
            System.out.println("This number is not prime or prime please enter another number");
            int primeNum = scanner.nextInt();
            if (primeNum > 1) {
                count++;
            }
        }
        int primeNum2 = count;
        if (primeNum2 > 1) {
            for (int j = 2; j < primeNum2; j++) {
                if (primeNum2 % j == 0) {
                    prime = false;
                }
            }
        }
        return prime;
    }
    public static boolean calculate(int num) {
        Scanner scanner = new Scanner(System.in);
        boolean array = false;
        int first, second, third, forth, fifth;
        int test = 0, test1 = 0, test2 = 0, test3 = 0, test4 = 0;
        int[] plindromArray = new int[5];
        int[] tempPlindrome = new int[plindromArray.length];
        int count = 1;
        int tempNum = num;
        for (int j = 0; j < count; ) {
            first = (tempNum % 100000 - tempNum % 10000);
            second = (tempNum % 10000 - tempNum % 1000);
            third = (tempNum % 1000 - tempNum % 100);
            forth = (tempNum % 100 - tempNum % 10);
            fifth = (tempNum % 10);
            test = first / 10000;
            test1 = second / 1000;
            test2 = third / 100;
            test3 = forth / 10;
            test4 = fifth;
            plindromArray[0] = test;
            plindromArray[1] = test1;
            plindromArray[2] = test2;
            plindromArray[3] = test3;
            plindromArray[4] = test4;
            for (int i = 0; i < 1; i++) {
                first = (tempNum % 100000 - tempNum % 10000);
                second = (tempNum % 10000 - tempNum % 1000);
                third = (tempNum % 1000 - tempNum % 100);
                forth = (tempNum % 100 - tempNum % 10);
                fifth = (tempNum % 10);
                tempPlindrome[4] = test;
                tempPlindrome[3] = test1;
                tempPlindrome[2] = test2;
                tempPlindrome[1] = test3;
                tempPlindrome[0] = test4;
            }
            if (plindromArray[4] == tempPlindrome[4]) {
                System.out.println("the numbers entered are a plinrome");
                j++;
            }
            if (plindromArray[4] != tempPlindrome[4]) {
                System.out.println("the numbers are not a plindrome enter another 5 numbers!");
                int num1 = scanner.nextInt();
                tempNum = num1;
            }
        }
        return array = true;
    }

    //------------------------------------------------------------------------------------------------------------------

    public static void printAllPrimeNumbersInRange(){
        boolean foundPrime = false;
        System.out.println("Prime numbers in range selected,");
        System.out.println("2 numbers required for range.");
        int start = getIntInput();
        int end = getIntInput();

        for (int i = start; i<= end; i++){
            if (checkIfPrimeNumber(i)){
                System.out.print(i + " ");
                foundPrime = true;
            }
        }

        if (!foundPrime){
            System.out.println("No Prime numbers found in range.");
        }

        System.out.println();
    } // Func_EX7
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
    } // Remove later when FuncEX 5 fixed.

    //------------------------------------------------------------------------------------------------------------------

    public static void print2NumbersGCD(){
        System.out.println("Find GCD selected,");
        System.out.println("2 numbers required for GCD.");
        int num1 = getIntInput();
        int num2 = getIntInput();
        System.out.println("The GCD is: " + calculateGCDFor2Numbers(num1, num2));
    } // Func_EX8
    public static int calculateGCDFor2Numbers(int smallerNum, int biggerNum){
        int tempNumber;
        if(smallerNum > biggerNum){
            tempNumber = smallerNum;
            smallerNum = biggerNum;
            biggerNum = tempNumber;
        }
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

    //------------------------------------------------------------------------------------------------------------------

    public static void printQuadraticEquationCalculation(){
        System.out.println("Quadratic Equation calculation selected,");
        float a, b, c;
        System.out.println("Number for a, ");
        a = getFloatInput();
        System.out.println("Number for b, ");
        b = getFloatInput();
        System.out.println("Number for c, ");
        c = getFloatInput();
        calculateQuadraticEquation(a, b, c);
    } // Func_EX9
    public static void calculateQuadraticEquation(float a, float b, float c) {
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

    //------------------------------------------------------------------------------------------------------------------

    public static void print_CompoundInterest(){
        final int FULL_YEAR = 12;
        final int FULL_3_YEARS = 36;

        System.out.println("Investment amount");
        int investment = getIntInput();
        System.out.println("Interest percentage");
        int interest = getIntInput();

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

    } // Func_EX10

    //------------------------------------------------------------------------------------------------------------------

    public static void checkIfPartOfFibonacciSeries(){
        System.out.println("Check if a number is part of Fibonacci series");
        boolean isPartOfFibonacciSeries = false;
        int fibonacciNum = 0;
        int tempNum1 = 0;
        int tempNum2 = 1;

        int number = getIntInput();

        while (fibonacciNum < number){
            fibonacciNum = tempNum1 + tempNum2;
            tempNum1 = tempNum2;
            tempNum2 = fibonacciNum;
            if (fibonacciNum == number){
                isPartOfFibonacciSeries = true;
                break;
            }
        }
        if(isPartOfFibonacciSeries){
            System.out.println("The number " + number + " is part of Fibonacci Series");
        }else {
            System.out.println("The number " + number + " is not part of Fibonacci Series :( ....");
        }
    } // Func_EX11

    //------------------------------------------------------------------------------------------------------------------

    public static void printMostClosestNarcissisticNumber(){
        System.out.println("Print closest Narcissistic Number");
        int number = getIntInput();
        int closeNarcissistNumber1 = number;
        int closeNarcissistNumber2 = number;
        int mostCloseNarcissistNumber;

        if(checkIfNarcissisticNumber(number)){
            System.out.println("Closest Narcissistic number: "+number);
        } else{
            while (!checkIfNarcissisticNumber(closeNarcissistNumber1)){
                closeNarcissistNumber1++;
            }
            while (!checkIfNarcissisticNumber(closeNarcissistNumber2)){
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
    } // Func_EX12
    public static boolean checkIfNarcissisticNumber(int number){
        int lengthOfNumber;
        double sumOfNumsToPowerOfNumbersCount;
        lengthOfNumber = getLengthOfNumber(number);
        sumOfNumsToPowerOfNumbersCount = doPowCalculationOnAllNumbers(number, lengthOfNumber);
        return number == sumOfNumsToPowerOfNumbersCount;
    } // (*)A Function to help Function of EX12
    public static int getLengthOfNumber(int number){
        int numbersCountInNum = 0;
        while (number > 0){
            numbersCountInNum++;
            number = number / 10;
        }
        return numbersCountInNum;
    } //Supporting function to - checkNarcissisticNumber()
    public static double doPowCalculationOnAllNumbers(int number, int numbersCountInNum){
        double sumOfNumsToPowerOfNumbersCount = 0;
        while (number > 0){
            sumOfNumsToPowerOfNumbersCount += doPowCalculation(number % 10, numbersCountInNum);
            number = number / 10;
        }
        return sumOfNumsToPowerOfNumbersCount;
    } //Supporting function to - checkNarcissisticNumber()
    public static double doPowCalculation(int base, int exponent){
        double result = 1;
        for (int i = 0; i < exponent; i++){
            result = result * base;
        }
        return result;
    } //Supporting function to - doPowCalculationOnAllNumbers()
}
