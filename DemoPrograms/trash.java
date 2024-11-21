package DemoPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class trash {

    public static void main(String[] args) {

        int[] nums = {1,2,5,6,7,9};

        List<Integer> missingList = new ArrayList<>();

        for(int i=1;i<=nums.length-1;i++){

            int cur = nums[i];
            int prev = nums[i-1];

            for(int j=prev+1;j<cur;j++){
                missingList.add(j);
            }
        }
        System.out.println(missingList);
    }


   /* public static void main(String[] args) {

        String str = "Hello World";
        char[] characters = str.toCharArray();

        Map<Character, Integer> charCount = new HashMap<Character, Integer>();

        for(char c : characters){

            if(charCount.containsKey(c)){
                charCount.put(c, charCount.get(c)+1);
            }else
                charCount.put(c,1);
        }

        System.out.println(charCount);

    }*/

   /* public static void main(String[] args) {

        String str = "java is good, java is very good, java is very very good";

        String[] words = str.split(" ");

        Map<String, Integer> wordsCount = new HashMap<>();

        for(String s: words){
            if(wordsCount.containsKey(s)){
                wordsCount.put(s, wordsCount.get(s)+1);
            }else
                wordsCount.put(s,1);
        }

        System.out.println(wordsCount);

        for(Map.Entry<String, Integer> entry : wordsCount.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue() );

        }

    }*/

}
