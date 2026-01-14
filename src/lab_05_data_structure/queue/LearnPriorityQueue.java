package lab_05_data_structure.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length(); // Z-A order
    }
}

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.addAll(List.of("Apple","Banana","Grape"));
        System.out.println(queue.poll()); //1st => Apple
        System.out.println(queue.poll()); //1st => Banana
        System.out.println(queue.poll()); //1st => Grape
        System.out.println(queue.poll()); //1st => null

        //add a comparator into queue
        Queue<String > orderedQueue = new PriorityQueue<>(new StringLengthComparator());
        orderedQueue.addAll(List.of("Cat","Monkey","Lion"));
        System.out.println(orderedQueue.poll());//length=6, Monkey
        System.out.println(orderedQueue.poll());//length=4, Lion
        System.out.println(orderedQueue.poll());//length=3, Cat
        System.out.println(orderedQueue.poll());//null
    }
}
