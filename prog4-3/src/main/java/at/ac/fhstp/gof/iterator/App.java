package at.ac.fhstp.gof.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>() {
            {
                add("first");
                add("second");
                add("third");
                add("fourth");
            }
        };
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()) {
            String next = iter.next();
            System.out.println(next);
        }
    }
}
