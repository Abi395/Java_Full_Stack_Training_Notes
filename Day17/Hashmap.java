package Day17;


//Map is interface and the hash map is in the class
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();

        //Key should not duplicates
        hm.put( 1 ,  " abc");
        hm.put( 2 ,  " pqr" );
        hm.put( 3 ,  " xyz");
        //System.out.println(hm);

        //Get the value by the key
        System.out.println("Value :"+ hm.get(1));

        //whether the key is presentor not
        System.out.println("Contains :"+ hm.containsKey(3));

        //whether the value is present or not
        System.out.println("Value contains :"+ hm.containsValue("abc"));

        
        // Iterable i = hm.iterator();
        // while(i.hasNext()){           ---> Iterator cannot be work in hashmap
        //     System.out.println(i.next());
        // }


    }
}
