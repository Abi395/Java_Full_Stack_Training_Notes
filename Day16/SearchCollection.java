package Day16;

import java.util.*;
public class SearchCollection {
    public static void main(String[] args) {
        LinkedList<Integer> List = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the size : ");
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            List.add(sc.nextInt());
        }
        System.out.println(List);

        if(List.contains(5)){
            System.out.println("Yes, its present");
        }
        else{
            System.out.println("No, not present");
            sc.close();
        }
    }
}
