package Beta;

//        *****
//         ****
//          ***
//           **
//            *

//* * * * *
//  * * * *
//    * * *
//      * *
//        *




public class Animal{
    public static void main(String[]args){

            int n = 10;
            int j;

            int num = 2 * n -2;

            for(int i=n; i>=1; i--){

                for( j =1; j<=n-i;j++){
                    System.out.print(" ");

                }
                num = num-2;

                for(j=0;j<i; j++ ){

                    System.out.print("*");
                }

                System.out.println();
            }


    }

}


//
//public abstract class Animal {
//
//    abstract void sound();
//
//}
//
//
//
//interface Animals {
//
//    abstract void sound();
//
//}