package DemoPrograms;

public class SmallestElementArray {

    public static void main(String[] args) {


        int arr[] = new int[]{1,4,6,7,44,32};
        int min = arr[0];

        for(int i=1; i<=arr.length-1; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println(min+ " is the smallest number in Array");
    }
}
