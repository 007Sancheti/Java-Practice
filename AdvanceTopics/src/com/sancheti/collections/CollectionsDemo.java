package com.sancheti.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");
        list.remove(0);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "!");
        System.out.println(list.indexOf("a+"));
    }
}
