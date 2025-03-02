
package com.jspider.program.src.collection_framework.collection;
import java.util.ArrayList;
import java.util.Collection;
public class AddObject {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        System.out.println(c1);
        System.out.println(c2);
        c1.add(34);
        c1.add(78);
        System.out.println(c1);
        c2.add(90);
        c2.add('@');
        c2.add("Kundan");
        System.out.println(c2);

    }
}
