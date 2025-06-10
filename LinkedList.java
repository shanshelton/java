import java.io.*;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        
        list.add("Good");
        list.add("Morning");
        list.add("Have");
        list.add("a");
        list.add("nice");
        list.add("day");

        System.out.println("Original Linked List: " + list);

        list.clear(); // removing all elements

        System.out.println("List after removing  elements : " + list);
        list.add("Looks");
        list.add("good");

        System.out.println("After adding again to empty list: " + list);
    }
}