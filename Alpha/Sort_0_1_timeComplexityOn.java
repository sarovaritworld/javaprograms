package Alpha;
import java.util.*;


/*
Piramal Finance
{1,1,0,1,1,1,0,1,1} - Sort in ascending order. Time complexity - O(n)
*/


public class Demo {


    public static void main(String[] args) {

        int nums[] = {1,1,0,1,1,1,0,1,1};

        int low = 0;
        int hg = nums.length-1;

        while(low < hg){

            if(nums[low] == 0){
                low++;
            } else if (nums[hg]==1) {
                hg--;
            }else{
                int tmp = nums[low];
                nums[low] = nums[hg];
                nums[hg] = tmp;
                low++;
                hg--;
            }

        }

        System.out.println(Arrays.toString(nums));

    }












    }
