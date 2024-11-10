package DemoPrograms;

// factorial of 5 = 5 x 4 X 3 X 2 X 1 = 120



public class Factorial {

    public static int getFactorial(int num){
        int fact=1;
        for(int i = num; i>=1;i-- ){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 5;

        System.out.println("Factorial of "+num+" is "+ getFactorial(num));
    }
}
