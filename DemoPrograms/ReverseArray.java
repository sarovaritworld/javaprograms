package DemoPrograms;

public class ReverseArray {


    public static void main(String[] args) {

        int[] arr = new int[]{1,5,6,7,83,9};

        for(int i= arr.length-1; i>=0; i--){

            System.out.print(arr[i]+" ");

        }

    }
}
