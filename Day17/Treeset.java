package Day17;

import java.util.*;
public class Treeset {
    public static void main(String[] args) {
        
        TreeSet<Integer> ts = new TreeSet<Integer>();
        //comparator.reverseOrder() - helps the object into descending order
        //if we remove the comparator reverse order it becomes ascending order by default
        // TreeSet<Integer> ts = new TreeSet<Integer>(Comparator.reverseOrder());

        //lambda function - to reverse the process in desending order and it doesn't remove the duplicates
        // TreeSet<Integer> ts= new TreeSet<>((a,b) -> (a<b?1:-1));

        //lambda function - to reverse the process in ascending order and it doesn't remove the duplicates
        // TreeSet<Integer> ts= new TreeSet<>((a,b) -> (a>b?1:-1));


        //To add the elements
        ts.add(12);
        ts.add(20);
        ts.add(7);
        ts.add(15);
        ts.add(20);
        System.out.println(ts);

        //to get the size of tree set
        System.out.println("Size of treeset : "+ts.size());

        // Iterator s = ts. iterator();//Iterator is a class
        // while(s.hasNext()){
        //     System.out.print(s.next()+ " ");
        // }

        //we can using the iterator in descending order without duplicates
        Iterator s = ts.descendingIterator();
        while(s.hasNext()){
            System.out.println(s.next()+" ");
        }
        System.out.println();

        //to print the element treeset to array
        Object[] a = ts.toArray();
        for(int i =0;i<a.length;i++){
            System.out.println("Array Element : " + a[i] +" ");
        }

         //to equals the element
        System.out.println("\n Equal: "+ ts.equals(20));
        System.out.println(ts);
        
        //to remove the first element
        System.out.println("PollFirst element : "+ts.pollFirst());
        System.out.println(ts);

        //to remove the last element
        System.out.println("PollLast element : "+ts.pollLast());
        System.out.println(ts);

        //to remove based - the element based on object will return the boolean true or false
        System.out.println("Removed element : "+ts.remove(12));
        System.out.println(ts);


        //it have an another method(for each loop) to print the elements
        // for(int i : ts) System.out.println(i+ " ");
    }
}
