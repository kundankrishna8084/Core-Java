
package com.jspider.program.src.collection_framework.collection;
import java.util.ArrayList;
import java.util.Collection;
public class RemoveAllCollection {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        c1.add(12); c1.add(126); c1.add(142); c1.add(162); c1.add(192);
        c1.add(142); c1.add(122); c1.add(172); c1.add(182); c1.add(102);
        c2.add(126);c2.add(16);c2.add(102);c2.add(182);
        c1.removeAll(c2);
        System.out.println(c1);
    }
}
