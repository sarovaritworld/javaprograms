package DemoPrograms;

public class PrimeNumber {

    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;

        }

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }


    public static void main(String[] args) {

        System.out.print("Prime number from 1 to 100 are ");

        for (int num = 2; num <= 100; num++) {

            if (isPrime(num)) {
                System.out.print(num + " ");
            }

        }
    }

}
