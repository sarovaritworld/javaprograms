package DemoPrograms;

//Fibonacci Series : is a serial which starts with 0 , 1 and then proceed further by sum of last 2 numbers
// Eg. 0, 1, 1, 2, 3, 5, 8, and so on


public class Fibonacci {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int count = 10;

        System.out.print("0,1");

        for(int i = 2; i<=count; i++ ){
            int sum = num1+num2;
            System.out.print(","+sum);
            num1 = num2;
            num2 = sum;

        }

    }





}
