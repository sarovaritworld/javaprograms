package Beta;

/*

input_array = [1,2,4,5,7,8,9,11,13,14,17]
        target = 16
*/
//
//move zeroes to the start and end:
//        [0, 1, 0, 3, 0, 0, 9, 11, 0,12]
// [ 0, 0 , 0 ,0 , 1, 3 , 2, 9 , 11 , 12 ]

public class Demo {

    public static void moveZero(int[] arr){

        int n = arr.length;
        int ind = n-1;

        for(int i = n-1; i >=0; i--){

            if(arr[i]!=0){
                arr[ind]= arr[i];
                ind--;
            }

        }

        while(ind>=0){

            arr[ind]=0;
            ind--;
        }
    }




    public static void main(String[] args) {

        int arr[] = {1,2,4,5,7,8,9,11,13,14,17};

        moveZero(arr);








    }


}
    

