package Edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EduCollection {
    public static void main(String[] args) {
        // ArrayList Class
        ArrayList<String> list = new ArrayList<String>();

        list.add("D");
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list.toString());

        System.out.println(list.get(3));
        list.remove(2);
        System.out.println(list.toString());

        Collections.sort(list);
        System.out.println(list.toString());

        // LinkedList Class
        List<String> linkedList = new LinkedList<>(); // String 생략 가능
        linkedList.add("D");
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        System.out.println(linkedList.toString());

    }
}
