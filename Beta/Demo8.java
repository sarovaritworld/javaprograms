package Beta;

import java.util.Stack;

public class Demo8 {

//    String s = "(ed(et(oc))el)";
//    output  : "(le(te(co)de)"



   public static String revString(String s){

       Stack<StringBuilder> stack = new Stack<>();

       StringBuilder  current = new StringBuilder();

       for(char c : s.toCharArray()){

           if(c == '('){
               stack.push(current);
               current = new StringBuilder();
               current.append(c);

           } else if (c == ')') {
                current.append(c);
                current.reverse();
                current = stack.pop().append(current);
           }else{
               current.append(c);
           }
       }
       return current.toString();
   }


    public static void main(String[] args) {

        String s = "(ed(et(oc))el)";

        System.out.println(revString(s));



        // "(le(te(co)de)"







    }


}
