
package com.jspider.program.src.collection_framework.collection;
import java.util.ArrayList;
import java.util.Collection;
public class AddAllCollection {
    public static void main(String[] args) {
        Collection c2 = new ArrayList();
        c2.add(90);c2.add('@'); c2.add("Kundan");c2.add("Krishna"); c2.add('$');

        Collection c1 = new ArrayList<>();
        c1.addAll(c2);
        System.out.println(c1);
    }
}
