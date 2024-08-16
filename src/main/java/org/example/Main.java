package org.example;

import org.example.utils.customList.customLinkedListImpl.CustomLinkedList;
import org.example.utils.customList.CustomList;

public class Main {
    public static void main(String[] args) {

        CustomList<String> list = new CustomLinkedList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");
        list.add("sixth");
        list.update(5, "updated");

        System.out.println(list.get(4));
        System.out.println(list.size());
        System.out.println(list.get(5));

        list.delete(2);

        System.out.println("---------------------------");
        for (String s: list) {
            System.out.println(s);
        }
    }
}