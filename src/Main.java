import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number");
            int firstNumber = scanner.nextInt();
            System.out.println(prime(firstNumber));
            //
        }

        public static void naturalNumbers(int naturalNumber1, int naturalNumber2) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            while (naturalNumber1 == naturalNumber2) {
                System.out.println("Error, Please enter a new number");
                naturalNumber1 = scanner.nextInt();
                naturalNumber2 = scanner.nextInt();
            }
            for (int i = naturalNumber1; i <= naturalNumber2; i++) {
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
}
