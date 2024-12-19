package Beta;
//
//Given an array of integers nums and an integer target,
//        return indices of the two numbers such that they add up to target.
//        Ex : Input: nums = [2,7,11,15], target = 18



// -ve numbers
// no valid pairs
// -ve target
// Multiple pairs
// single element in input array
// same number in array
// special chars,




public class Demo3 {

    public static void main(String[] args) {

        int arr[] =  {2,7,11,15};
        int target = 9;
        int arr1[] = new int[2];



        for (int i =0; i<arr.length; i++){

            for (int j = i+1; j< arr.length; j++){

                if(arr[i]+arr[j]== target){
                    System.out.println(new int[] {i, j});


                }

            }



        }


    }




}
