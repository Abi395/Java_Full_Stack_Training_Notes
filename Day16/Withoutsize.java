package Day16;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Withoutsize {
    public static void main(String[] args) {
        // LinkedList<Integer> List = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        // while(true){
        //     int a = sc.nextInt();
        //     if(a==-1) break;
        //     List.add(a);
        // }

        // int size = (List.size()-1);
        // while(size>0){
        //     if(List.get(size)%2==0){
        //         List.remove(size);
        //         size--;
        //     }
        //     size--;
        // }
        // System.out.println(List);
        // // int finder = sc.nextInt();
        // // System.out.println((List.contains(finder))?"Yes":"No");

         LinkedList<Integer> List = new LinkedList<Integer>();
        while(true){
            int a = sc.nextInt();
            if(a==-1) break;
            List.add(a);
        }
         LinkedList<Integer> List1 = new LinkedList<Integer>();
        while(true){
            int b = sc.nextInt();
            if(b==-1) break;
            List.add(b);
        }

        //For merging we created the two linked list and merge list all in list1
         List.addAll(List1);
         Collections.sort(List);
         System.out.println(List);

        sc.close();
    }
}
