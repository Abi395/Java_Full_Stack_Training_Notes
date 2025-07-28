package Day17;

//In set it will print in ascending order
//The linkedhash set and hashset is same like the comparator reverse order and descending iterator is not apply in this
//This won't allows the duplicates
//It only stores in descending order

import java.util.*;
public class Hashset {
    public static void main(String[] args) {

        //Ascending order without duplicates for hashset
        //HashSet<Character> hs = new HashSet<Character>();

        HashSet<Character> hs = new HashSet<Character>();


        //For linked hashset - returns same order without duplicates(Linkedhashset)
        // LinkedHashSet<Character> hs = new LinkedHashSet<Character>();

        hs.add('A');
        hs.add('B');
        hs.add('I');
        hs.add('N');
        hs.add('A');
        System.out.println(hs);

        Iterator i = hs.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+ " ");
        }
        System.out.println();

        for(char c : hs){
            System.out.print(c + " ");
        }
    }
}
