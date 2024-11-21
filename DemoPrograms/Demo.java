package DemoPrograms;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {

        String phrase = "java is awesome, java is amazing, java is powerfull";
        String[] words = phrase.split(" ");

        Map<String, Integer> wordscount = new HashMap<>();

        for (String word : words) {

            if (wordscount.containsKey(word)) {
                wordscount.put(word, wordscount.get(word) + 1);
            } else {
                wordscount.put(word, 1);
            }
        }
        System.out.println(wordscount);

        for (Map.Entry<String, Integer> entry : wordscount.entrySet()) {
            System.out.println(entry.getKey() + " Repeated " + entry.getValue() + " times");
        }

    }
}










//str1- My name is sarovar
//str2- my naam are is sarovar okay

//sub
//in
//del

//package Demo;
//
//public class Demo {
//
//    public static void main(String[] args){
//
//        String str1 = "My name is sarovar";
//        String str2 = "my naam are is sarovar okay";
//
//        String[] words1 = str1.split(" ");
//        String[] words2 = str2.split(" ");
//
//        String[] ins = new String[0];
//
//        for(int i=0;i< words1.length;i++){
//
//            if(words1[i]!=words2[i]){
//                ins.append(words1[i]);
//            }
//
//
//        }
//
//    }
//
//}






























//package Demo;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Demo {
//
//    public static List<Integer> findMissings(int[] arr){
//
//        List<Integer> missings = new ArrayList<>();
//
//        for(int i = 1; i<=arr.length-1;i++){
//
//            int cur = arr[i];
//            int prev = arr[i-1];
//
//            for(int j = prev+1; j<cur; j++)
//                missings.add(j);
//        }
//
//        return missings;
//    }
//
//    public static void main(String[] args){
//
//    int[] nums = {10,11,12,15,20};
//    List<Integer> miss = findMissings(nums);
//    System.out.println(miss);
//
//    }
//}
//






// find the missing number from array
//nums = {10,11,13,14,16,21};
//    package Demo;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Demo {
//
//        public static List<Integer> findMissingNum(int[] arr){
//            List<Integer> miss = new ArrayList<>();
//
//
//            for(int i = 1; i <= arr.length-1; i++){
//                int cur = arr[i];
//                int prev = arr[i-1];
//
//                for(int j = prev+1; j<cur;j++)
//                    miss.add(j);
//            }
//            return miss;
//        }
//
//        public static void main(String[] args){
//
//        int[] nums = {10,11,13,14,16,25};
//
//        List<Integer> missingNumbs = findMissingNum(nums);
//        System.out.println(missingNumbs);
//
//        }
//    }
//
//


//package Demo;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class Demo {
//
//    public static String arrMinMax(int[] array){
//
//        int smallest = array[0];
//        int largest = array[0];
//
//        for(int i = 1; i<= array.length-1; i++){
//
//            if (array[i]<smallest)
//                smallest = array[i];
//            else if (array[i]>largest) {
//                largest = array[i];
//            }
//        }
//
//        String res = "Array : "+ Arrays.toString(array)+"\nsmallest :"+smallest+"\nlargest : "+ largest;
//        return res;
//    }
//
//
//    public static void main(String[] args){
//        int[] nums = {1,2,4,6,6,7,8,85,4};
//
//        System.out.println(arrMinMax(nums));
//    }
//}
//
//


//// WAP to find the smallest and largest element in array
//// arr = {1,2,3,4,5,6,7,8,9}
//// smallest : 1
//// largest : 9
//
//
//
//package Demo;
//import java.util.Arrays;
//
//public class Demo {
//
//    public static void main(String[] args){
//
//        int[] intArr = {1,2,4,5,677,88,6,0,-1,-22};
//
//        int largest = intArr[0];
//        int smallest = intArr[0];
//
//        for(int i = 1; i<=intArr.length-1;i++){
//
//            if(intArr[i]>largest)
//                largest = intArr[i];
//            else if (intArr[i]<smallest)
//                smallest = intArr[i];
//
//        }
//
//        System.out.println("Array elements are : "+ Arrays.toString(intArr));
//        System.out.println("Smallest element : "+ smallest);
//        System.out.println("largest element : "+ largest);
//
//    }
//}
//
//



// WAP to revere the sequence of words
//String str = "this is java";
//res = "siht si avaj"

//package Demo;
//
//public class Demo {
//
//    public static void main(String[] args){
//
//        String str = "this is java";
//
//        String[] words = str.split(" ");
//        String res = "";
//
//        for(String word : words){
//
//            for(int i = word.length()-1;i>=0;i--){
//                res = res + word.charAt(i);
//            }
//            res += " ";
//        }
//        System.out.println(res);
//
//    }
//}





// WAP to revere the sequence of words
//String str = "this is java";
//res = "java is this"

//package Demo;
//
//import java.lang.reflect.Array;
//
//public class Demo {
//
//    public static void main(String[] args){
//
//        String str = "this is java";
//
//        String[] words =  str.split(" ");
//        String res = "";
//
//        for(int i = words.length-1; i>=0 ; i--){
//            res = res + words[i] + " ";
//        }
//
//        System.out.println(res);
//
//    }
//}
//
//





// WAP to reverse string using String buffer
//package Demo;
//
//public class Demo {
//    public static void main(String[] args){
//
//        String str = "raamna";
//
//        StringBuffer sb = new StringBuffer(str);
//
//        System.out.println(sb.reverse());
//    }
//
//}
//
//


//reverse string without using string buffer
//
//package Demo;
//
//public class Demo {
//
//    public static void main(String[] args){
//
//        String str = "Savings";
//        String rev = "";
//
//        for(int i = str.length()-1; i>=0; i--){
//            rev = rev + str.charAt(i);
//        }
//
//        System.out.println(rev);
//    }
//}




//find firts non repeated character in string
//
//package Demo;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//public class Demo {
//
//    public static void main(String[] args){
//
//        String str = "swiss";
//        char[] chr_arr = str.toCharArray();
//        Map<Character, Integer> chr_count = new LinkedHashMap<>(); //  LinkedHashMap is used bcoz it preserves the sequence
//
//        for(char ch : chr_arr){
//            if(chr_count.containsKey(ch)){
//                chr_count.put(ch,chr_count.get(ch)+1);
//            }else{
//                chr_count.put(ch,1);
//            }
//        }
//
//        for(Map.Entry<Character, Integer> entry : chr_count.entrySet()){
//            if(entry.getValue()==1){
//                System.out.println(entry.getKey()+" is the first not repeated character in string '"+str+"'");
//                break;
//            }
//        }
//    }
//}


//WAP to check the ANAGRAM

//package Demo;
//
//import java.util.Arrays;
//
//public class Demo{
//
//    public static void main(String[] args){
//
//        String str1 = "stop";
//        String str2 = "spot";
//
//        char[] arr1 = str1.toCharArray();
//        char[] arr2 = str2.toCharArray();
//
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        if(Arrays.equals(arr1, arr2)){
//            System.out.println("Given String are anagram");
//        }else{
//            System.out.println("Given String are not anagram");
//        }
//    }
//}


//package Demo;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Demo{
//
//    public static void main(String[] args){
//
//        String str = "JAVAAAV";
//        char[] chr = str.toCharArray();
//        Map<Character, Integer> char_count = new HashMap<>();
//
//       for(char c : chr){
//           if(char_count.containsKey(c)){
//               char_count.put(c,char_count.get(c)+1);
//           }else{
//               char_count.put(c,1);
//           }
//       }
//
//       for(Map.Entry<Character, Integer> entry:char_count.entrySet()){
//           if(entry.getValue()>1){
//               System.out.println(entry.getKey()+" is dpuplicate, Repeated "+entry.getValue()+" times");
//           }
//       }
//    }
//}




////count character occurance in given string
//
//package Demo;
//
//public class Demo{
//
//    public static void main(String[] args){
//
//        String phrase = "this is awesome to learn java";
//        char ch = 's';
//        int count=0;
//
//        System.out.println(phrase.replaceAll("s","").length());
//        System.out.println(phrase.length());
//
//        for(int i = 0; i<phrase.length();i++){
//            if(phrase.charAt(i)==ch){
//                count++;
//            }
//
//        }
//
//        System.out.println(ch+" occures "+ count+ " Times");
//
//
//
//    }
//}
//
//


//package Demo;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Demo{
//
//    public static void main(String[] args){
//
//        String phrase = "This is java and java is my love";
//
//        String[] words = phrase.split(" ");
//
//        Map<String, Integer> word_count = new HashMap<>();
//
//        for(String word : words){
//            if(word_count.containsKey(word)){
//                word_count.put(word,word_count.get(word)+1);
//            }else{
//                word_count.put(word,1);
//            }
//        }
//
//        for(Map.Entry<String, Integer> entry : word_count.entrySet()){
//            System.out.println(entry.getKey()+" : "+ entry.getValue());
//        }
//
//
//    }
//
//}





//package Demo;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Demo {
//
//    public static void main(String[] agrgs){
//
//        String phrase = "this is java and java is awesome";
//        String[] words = phrase.split(" ");
//
//        Map<String, Integer> words_count = new HashMap<>();
//
//        for(String word : words){
//            if(words_count.containsKey(word)){
//                words_count.put(word,words_count.get(word)+1);
//            }else{
//                words_count.put(word,1);
//            }
//        }
//
//        for (Map.Entry<String, Integer> entry : words_count.entrySet()){
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//        }
//    }
//}
//



//package Demo;
//
////Write a function that groups anagrams from a list of strings.
////        Anagrams are words that contain the same characters but in different orders.
//
////Bat tab tab bta
//
//public class Demo {
//
//    String word1 = "Bat";
//    String word2 = "taB";
//
//    public boolean checkAnagram(String word1, String word2) {
//
//
//
//        convertToList(String word){
//
//            for(int i =0; i<= word.length(); i++){
//                charArr char[i] = word1.charAt[i];
//            }
//
//        }
//
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
//
//
//    public static void main(String[] args){
//
//
//
//        System.out.println("hiiieee");
//
//
//
//    }
//
//}
