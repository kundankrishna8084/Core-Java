
package com.jspider.program.src.collection_framework.collection;
import java.util.*;
public class RemoveObject {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        c1.add(12); c1.add(126); c1.add(142); c1.add(162); c1.add(192);
        c1.add(142); c1.add(122); c1.add(172); c1.add(182); c1.add(102);
        System.out.println(c1.remove(126));
        System.out.println(c1);
    }
}
