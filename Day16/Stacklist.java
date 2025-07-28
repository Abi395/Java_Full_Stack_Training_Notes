package Day16;

import java.util.*;
public class Stacklist {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();

        //to add the element in stack
        s.push(10);
        s.push(7);
        s.push(20);
        s.push(15);

        //to print the stack element
        System.out.println("Stack : "+s);

        //To pop the element
        System.out.println("Popped element : "+s.pop());

        //to check the peek element
        System.out.println("Peek element : "+s.peek());

         Iterator i = s.iterator();
         System.out.print("Iterators : ");
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }

    }
}
