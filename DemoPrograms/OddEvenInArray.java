package DemoPrograms;

public class OddEvenInArray {

    public static void main(String[] args) {

        int arr[] = new int[]{1,3,65,7,4,3,2};

        System.out.println("Even Number in array are : ");
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("odd Number in array are : ");
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }


    }
}
