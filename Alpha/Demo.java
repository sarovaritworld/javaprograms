package Alpha;
import java.util.*;

public class Demo {

    public static String LongestSubstring (String str){

        int maxLen = 0;
        String lSubstring = "";

        if(str.length() == 0){
            System.out.println("Combinations not possibles");
        }

        for(int i = 0; i<=str.length(); i++){

            Set<Character> se = new HashSet<>();
            StringBuilder curSubString = new StringBuilder();

            for(int j =i; j<str.length(); j++){

                char curChar = str.charAt(j);
                if(se.contains(curChar)){
                  break;
                }

                curSubString.append(curChar);

                if(curSubString.length()>maxLen){
                    maxLen = curSubString.length();
                    lSubstring = curSubString.toString();
                }

            }

        }
        return lSubstring;
    }



    public static void main(String[] args) {



        String str = "abcabcbb";

        System.out.println(LongestSubstring(str));









    }

}
