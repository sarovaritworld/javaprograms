//package DemoPrograms;
//
//public class findDuplicatesArray {
//
//    public static void main(String[] args) {
//
//        int arr1[] = new int[]{1,2,3,4,2,3,2,3,4,5};
//        for(int i=0; i<= arr1.length-1; i++){
//
//            for(int j=i+1;j<=arr1.length-1;j++){
//                if(arr1[i]==arr1[j]){
//                    System.out.print(arr1[j]+" ");
//                }
//            }
//
//
//        }
//    }
//
//}



// Using HashSet to avoid printing duplicates again
package DemoPrograms;

import java.util.HashSet;

public class findDuplicatesArray {

    public static void main(String[] args) {

        int arr1[] = new int[]{1, 2, 3, 4, 2, 3, 2, 3, 4, 5};
        HashSet<Integer> duplicates = new HashSet<>();
        HashSet<Integer> printed = new HashSet<>();

        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j] && !printed.contains(arr1[i])) {
                    duplicates.add(arr1[j]);
                    printed.add(arr1[i]);
                }
            }
        }

        System.out.print("Duplicate elements: ");
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
    }
}
