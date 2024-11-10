package DemoPrograms;

//Armstrong : sum of cube of each digit of number is equals to number itself
// 153 = (1x1x1)+(5x5x5)+(3x3x3) =  1 + 125 + 27 = 153 ( same as given number so it is armstrong)

public class Armstrong {


    public static void main(String[] args) {
        int num = 151;
        int target = 153;
        int res = 0;


        while(num>0){
            int rem = num%10;
            num = num/10;
            res = res+(rem*rem*rem);
        }

        if(res==target)
            System.out.println(target+" is Armstrong Number");
        else
            System.out.println(target+" is not a Armstrong Number");

    }








}
