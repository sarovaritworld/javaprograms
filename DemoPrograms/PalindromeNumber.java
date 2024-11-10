package DemoPrograms;

//PalindromeNumber :  ulta sidha ek saman --> 1221, 151, 12321 etc

public class PalindromeNumber {


    public static void main(String[] args) {
        int num = 151, rem, res=0;
        int temp = num;

        while(num>0){
            rem = num%10;
            res= (res*10)+rem;
            num = num/10;
        }

        if(res==temp){
            System.out.println(temp+" is a palindrome number");
        }else
            System.out.println(temp+" is not a palindrome number");

    }



}
