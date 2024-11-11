package DemoPrograms;

public class LargestElementArray {

    public static void main(String[] args) {


        int arr[] = new int[]{1,4,6,7,44,32};
        int max = arr[0];

        for(int i=1; i<=arr.length-1; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println(max+ " is the largest number in Array");
    }
}
