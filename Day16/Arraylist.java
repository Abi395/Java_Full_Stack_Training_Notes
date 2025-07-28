package Day16;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        //List
        //Arraylist<Integer>--> for the int or string we can change 
        ArrayList<Integer> alist = new ArrayList<Integer>();
        alist.add(5);
        alist.add(6);
        alist.add(7);
        alist.add(8);
        alist.add(9);

        //To get the particular indexof element
        System.out.println("Index :" +alist.get(2));

        //to add element 
        alist.add(10);
        System.out.println("Printed Element : "+alist);

        //to add the element in index
        alist.add(2, 11);
        System.out.println("Added element : " +alist);

        //to get the index of element
        alist.get(3);
        System.out.println("Index getted : " +alist);

        //To set or replace the element in index
        alist.set(3, 12);
        System.out.println("Replaced element : "+alist);

        //To remove the element from the index
        alist.remove(2);
        System.out.println("Removed element : "+alist);

        //To remove the object
        alist.remove(alist);
        System.out.println("Removed object : "+alist);

        //to return the size of elements
        alist.size();
        System.out.println("Array size : "+alist.size());


        //Check if list contains elements
        System.out.println("Check the list : "+alist.contains(6));

        //to print the first index of element
        System.out.println("Index of element : "+alist.indexOf(9));

        //Retun last index of element
        System.out.println("Last index of element : "+alist.lastIndexOf(5));

        //To return in string
        System.out.println("String representation :"+alist.toString());

        // //To clear the elements
        alist.clear();
        System.out.println("Cleared elements : "+alist);

        //To check the list is empty
        alist.isEmpty();
        System.out.println("Empty : "+alist);


        //To print the element from array
        System.out.println(alist);

        //iterator
        Iterator i = alist.iterator();
        while(i.hasNext()){//for get the next element from the array
             System.out.println(i.next());//the word next takes the value from the array elements
             System.out.println(i.next());
             System.out.println(i.next());
             System.out.println(i.next());
        }
    }
}
