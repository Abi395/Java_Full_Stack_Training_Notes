package Day17;

import java.util.*;

public class Priorityqueue {
    public static void main(String[] args) {

        //For min heap
        //PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        //Lambda function to reverse
        //PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->(a>b)?1:-1);

        //Instead of using priorityqueue we can use queue
        //Queue<Integer> pq = new PriorityQueue<Integer>();

        //Dequeue si only applicable in linkedlist,print the output in same order
        //Deque<Integer> pq = new LinkedList<>();

        //instaed of linkedlist we can use arraydeque
        Deque<Integer> pq = new ArrayDeque<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(25);
        System.out.println(pq);
    }
}
