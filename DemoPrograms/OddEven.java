package DemoPrograms;

// even : num % 2 == 0
// odd : num % 2 != 0


public class OddEven {

    public static void main(String[] args) {

        for(int i = 0; i<=100;i++){
            if(i%2==0)
                System.out.println(i+" is Even");
            else
                System.out.println(i+" is odd");
        }


    }


}
