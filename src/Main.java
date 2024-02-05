public class Main {
    public static void main(String[] args) {
        // Starting point
        // We will write the code
        // all together
    }

    // TO DO: funcEx1, funcEx2, funcEx3
    //        funcEx4, funcEx5, funcEx6
    //        funcEx7, funcEx8, funcEx9
    //        funcEx10(V), funcEx11(V), funcEx12(V)
    // Tonny added function 10, 11, 12

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
