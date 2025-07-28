package Day16;
import java.util.*;

public class LinkedlistCollections {
    public static void main(String[] args) {
        LinkedList<Integer> List = new LinkedList<Integer>();

        //To add element
        List.add(12);
        List.add(33);
        List.add(10);
        List.add(30);

        //To add the element from index
        List.add(3, 7);
        System.out.println("Index first element : " + List);


        //To add the element in first
        List.addFirst(23);

        //To add the element in last
        List.addLast(50);

        //To print the elements in array
        System.out.println("\n"+List);

        //For print the last element
        System.out.println("\nLast element : " +List.getLast());

        //To print the first element
        System.out.println("First element : " +List.getFirst());

        //To print the element using index
        System.out.println("Index element : "+List.get(2));

        //To remove the element using index
        System.out.println("Remove element using index : "+List.remove(4));



        System.out.println(List);

        Iterator i = List.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
