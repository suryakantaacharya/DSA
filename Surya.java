import java.sql.SQLOutput;
import java.util.*;

public class Surya {
    public static void main(String[] args) {
        System.out.println("Hello from surya's workspace");
        //stacksystem();
        //queueSystem();
        //priorityQueue();
       // linkedList();
       // dynamicArray();
       // linearSerch();
       // binarySerch();
       // interpolationSerch();
        bubbleSort();




    }

    /*
        uses of stack - last in first out data structure
       - undo and redo
       - backtracking syste.
         */
    static void stacksystem(){
        Stack<String> stack = new Stack<>();

        System.out.println(stack.empty());
        //push adds to the stack
        stack.push("surya1");
        stack.push("surya2");
        stack.push("surya3");
        System.out.println(stack.empty());
        //pop removed from the stack
        stack.pop();
        System.out.println(stack);

        //peek finds the top element present
        System.out.println(stack.peek());

        //serch returns the position of the element i.e it starts from 1 not zero
        System.out.println(stack.search("surya2"));
    }


    static void queueSystem(){
        /*
        Fifo -first in first out just like a normal queue
        enque - add objects , deque - remove objects

        - it's a linear data structure
        used in LinkedLists, ProrityQueues , Bredth-first serch
         */

        //Queue is an interface so it's instance can't be created
        Queue<String> queue = new LinkedList<>();
        queue.offer("surya1");
        queue.offer("surya2");
        queue.offer("surya3");
        queue.offer("surya4");
        queue.offer("surya5");

        System.out.println(queue);

        System.out.println(queue.peek());

        queue.poll();
        queue.poll();
        System.out.println(queue);

        System.out.println(queue.isEmpty());

        System.out.println(queue.size());

        System.out.println(queue.contains(""));


    }

    static void priorityQueue(){
        /*
        Priotity queue = A fifo ds which serves the elements with the highest priorities
         */

        Queue<Double> prioQueue = new PriorityQueue<>();

        prioQueue.offer(1.0);
        prioQueue.offer(11.0);
        prioQueue.offer(89.0);
        prioQueue.offer(69.0);
        prioQueue.offer(5.0);

        while(!prioQueue.isEmpty()){
            System.out.println(prioQueue.poll());
        }


        Queue<Double> prioQueueReversed = new PriorityQueue<>(Collections.reverseOrder());

        prioQueueReversed.offer(1.0);
        prioQueueReversed.offer(11.0);
        prioQueueReversed.offer(89.0);
        prioQueueReversed.offer(69.0);
        prioQueueReversed.offer(5.0);

        while(!prioQueueReversed.isEmpty()){
            System.out.println(prioQueueReversed.poll());
        }
    }

    static void linkedList(){
        /*
         - one node stores data and address of the next node.
        - dynamic
        insersion and deletion is easier
        no / low memory waste

        - more memory usage
        - No random access of elements
        - accessing elements and serching them is time consuming.
         */


        LinkedList<String> linkedList = new LinkedList<>();

//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");
//
//        System.out.println(linkedList);

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        System.out.println(linkedList);
        linkedList.add(4 , "E");
        System.out.println(linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.peekFirst();
        linkedList.peekLast();

    }


    static void dynamicArray(){

    LinkedList<Integer> linkedList = new LinkedList<>();
    ArrayList<Integer> arrayList = new ArrayList<>();


    for(int i = 0; i < 100000 ; i++){
        linkedList.add(i);
        arrayList.add(i);
    }


    Long prev = System.nanoTime();
        arrayList.get(87);
    Long after = System.nanoTime();
        System.out.println(after - prev);

    }

    static void linearSerch(){

        int[] array = {1,2,3,4,5,6,7,8};
        int toBeserched = 4;

        for(int i = 0 ; i< array.length; i++){
            if(array[i] == toBeserched){
                System.out.println("Element found at index" + i);
            }
        }


    }

    static void binarySerch() {

 // it tries to find the position of a target value within a sorted array.
        int array[] = new int[100];
        int target = 42;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int low = 0;
        int end = array.length - 1;

        while (low <= end) {
            int middle = low + (end - low) / 2;
            int value = array[middle];

            if (value < target) low = middle + 1;
            else if (value > target) end = middle - 1;
            else System.out.println(middle);

        }
    }


    static void  interpolationSerch(){
        int array[] = {1,2,3,4,5,6,7,8,9};
        int target = 7;
    }

    static void bubbleSort(){

        int array[] = {3,1,2,4,5,9,6,7,8};

        for(int i = 0; i< array.length-1 ; i++){
            for(int j = 0; j< array.length-1 ; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for(int i: array){
            System.out.println(i);
        }

    }


    static void selectionSort(){

    }


}
