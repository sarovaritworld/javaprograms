package DemoPrograms;

import java.util.HashMap;

public class HashmapOperations {
    public static void main(String[] args) {


        //Map declration
        HashMap<Character, Integer> mp = new  HashMap<Character, Integer>();

        //Insersting value
        mp.put('a',23);
        mp.put('b',24);
        mp.put('c',25);
        mp.put('d',26);
        mp.put('e',27);
        mp.put('f',28);

        //get map values
        System.out.println(mp.get('a'));

        //remove map value
        System.out.println("before remove"+ mp);
        mp.remove('f');
        System.out.println("after remove"+ mp);

        //clear map
        //mp.clear();
        System.out.println("after clearing"+mp);

        //size
        System.out.println(mp.size());

        //iterarte key
        for(char c : mp.keySet()){
            System.out.println(c);
            System.out.println(mp.get(c));
        }

        //iterate value
        for(int i : mp.values()){
            System.out.println(i);
        }
    }


}
