//package Beta;
//
///*
//Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/
//
//import java.util.HashMap;
//
//public class Demo1 {
//
//
//    public static int[] macthTarget( int[] nums, int target){
//
//        HashMap<Integer, Integer> hmap = new HashMap<>();
//
//        for(int i = 0; i<= nums.length; i++) {
//            int com = target - nums[i];
//
//            if(hmap.containsKey(com)){
//
//                hmap.get(com);
//
//            }
//
//            hmap.put(nums[i], i);
//        }
//
//    }
//
//
//    public static void main(String[] args) {
//
//
//
//        int nums[] = {2,7,11,15};
//        int target = 9;
//
//
//
//
//
//
//
//
//
//
//       /* for(int i = 0; i<= nums.length; i++){
//
//            for(int j = i+1; j<nums.length; j++){
//
//                if(nums[i]+nums[j] == target){
//
//                    System.out.println(i +" "+ j);
//
//                }
//
//
//            }
//
//        }*/
//
//
//
//
//
//
//
//    }
//
//
//}
