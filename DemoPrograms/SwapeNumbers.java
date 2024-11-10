package DemoPrograms;

public class SwapeNumbers {
    public static void main(String[] args){

        int num1 = 5;
        int num2 = 8;

        System.out.println("before swapping num1: "+num1+" and num2: "+num2);
        int temp = num1;

        num1 = num2;
        num2 = temp;

        System.out.println("after swapping num1: "+num1+" and num2: "+num2);

    }

}
