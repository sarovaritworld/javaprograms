package DemoPrograms;

// if two string have same character may be sequence will be different are anagram
// grab == brag --> these are anagrams

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "tac";
        String str2 = "cat";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);

        if(Arrays.equals(string1, string2)){
            System.out.println("Anagram");
        }else
            System.out.println("not a Anagram");

    }
}
