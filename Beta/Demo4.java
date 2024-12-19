//package Beta;
//
////
//// {1,7,4,3,7,4,1,3,8,9,1,5}
//
//
////  1 - 3
//// 7 -
//
//
//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.Set;
//
//public class Demo4 {
//
//    public static Integer UnqEle(int[] arr) {
//
//        Set<Integer> nums = new LinkedHashSet<>();
//        Set<Integer> duplicates = new HashSet<>();
//
//        for (int num : arr) {
//            if (duplicates.contains(num)) {
//                continue;
//            }
//
//            if (nums.contains(num)) {
//
//                nums.remove(num);
//                duplicates.add(num);
//            } else {
//                nums.add(num);
//            }
//
//        }
//
//    }
//
//
//}
