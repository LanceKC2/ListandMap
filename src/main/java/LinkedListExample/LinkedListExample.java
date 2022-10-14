package LinkedListExample;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Bob");
        namesLinkedList.add("Paul");
        namesLinkedList.add("George");
        namesLinkedList.add("Luke");
        namesLinkedList.get(2);
        namesLinkedList.add(1, "Jerry");

        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("Bob");
        namesArrayList.add("Paul");
        namesArrayList.add("George");
        namesArrayList.add("Luke");
        namesArrayList.get(2);
        namesArrayList.add(1,"Jerry");
    }
}
