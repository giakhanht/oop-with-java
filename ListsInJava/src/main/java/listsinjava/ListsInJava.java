package listsinjava;
import java.util.ArrayList;
import java.util.List;

public class ListsInJava {
    public static void main(String[] args) {
        //ArrayList is a pre-written class implementing List interface
        /*
        Like all Collections (in Java Collection Framework), ArrayList can
        only store objects (of wrapper classes) like Integer and Character
        */
        
        //Declaring and instantiating an ArrayList
        ArrayList<Integer> intArrayList = new ArrayList<>();
        //LIst is a superinterface of ArrayList
        List<Integer> intArrayList2 = new ArrayList<>();
        
        //ArrayList class has a bunch of pre-written methods
        
        //1. Editing the ArrayList:
        //add(): add members to a list, either to the end of the list, or at specific index
        intArrayList.add(15);
        intArrayList.add(30);
        intArrayList.add(60);
        intArrayList.add(75);
        intArrayList.add(2, 45);
        
        //set(): replace a member at a specific index
        intArrayList.set(3, 9999999);
        
        //remove(): remove a member at a specific index
        intArrayList.remove(3);
        
        //clear(): wipe out all members in a List
        intArrayList.clear();
        
        //2. Analyzing the ArrayList
        //get(): get an element at a specific index
        intArrayList.get(1); //30
        
        //toArray(): get all elements
        Integer[] fetchedElements = intArrayList.toArray(new Integer[5]); // Integer array of size 5
        
        //contains(): see if a member exists in an ArrayList
        intArrayList.contains(30); //true
        
        //indexOf(): get the index of the -first occurence- of a member
        intArrayList.indexOf(30); //1
        
        //size(): find out the number of members inside the ArrayList
        int howMany = intArrayList.size();
        
        
        
    }
}