package DemoPrograms;

public class CopyArray2Another {

    public static void main(String[] args) {

        int arr1[] = new int[] {1,4,6};
        int[] arr2 = new int[arr1.length];


        for(int i=0; i<=arr1.length-1;i++){
            arr2[i] = arr1[i];
        }

       for(int j=0; j<=arr1.length-1;j++){
           System.out.print(arr2[j]+", ");
       }




    }


}
