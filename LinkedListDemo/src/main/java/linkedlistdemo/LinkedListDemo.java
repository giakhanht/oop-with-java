package linkedlistdemo;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //ArrayList is sized dynamically, whenever we add or remove elements from it, every other elements must be shifted
        /*
        ArrayList calculates the address of each element using its first element,
        LinkedList stores the addresses of the neighbouring elements of each element.
        
        As a result, no element has to be shifted when an element is added/removed,
        resulting in a considerable reduction in time delay,
        in exchange for bigger memory usage.
        
        Finding a specific in LinkedList is also more time-consuming than ArrayList,
        since you have to follow through each element from the first element. 
        
        Conclusion:
        - LinkedList store addresses of neighbouring elements for each element,
        ArrayList calculate the address of every subsequent elements based on the first one.
        - ArrayList is best if you need to find and examine elements frequently, and to save memory.
        - LinkedList is best if you need to edit the list frequently,
        and to use more advanced methods of Queue and Deque interfaces.
        */
        
        LinkedList<Character> myLinkedList = new LinkedList<>();
        myLinkedList.add('A');
        myLinkedList.add('B');
        myLinkedList.add('C');
        myLinkedList.add('D');
        
        //Exclusive methods from Queue and Deque interfaces of LinkedList class
        //Most uerful methods for LinkedList/Deque
        
        //1. pollFirst()/pollLast(): Retrieve and then remove the first/last element of the deque, return null if empty
        Character firstChar = myLinkedList.pollFirst();
        Character lastChar = myLinkedList.pollLast();
        
        //2. peekFirst()/peekLast(): Retrieve but not remove the first/last element of the deque, return null if empty
        Character firstCharr = myLinkedList.peekFirst();
        Character lastCharr = myLinkedList.peekLast();
        
        //3. addFirst()/addLast(): Insert a specified element at the beginning/end of the deque
        myLinkedList.addLast('Y');
        
        //4. getFirst()/getLast(): almost identical to peekFirst()/peekLast() except return NoSuchElementException if empty instead
        
        //5. ifEmpty(): check if the deque if empty
        System.out.println(myLinkedList.isEmpty());
    }
}