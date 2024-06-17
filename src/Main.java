import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Demo for Collection Classes
        // List basic methods i. add ii. set iii. remove

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        for(Integer i : arrayList) {
            System.out.println(i);
        }

        arrayList.set(1,4);

        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);

        // Comparable and Comparator interfaces



    }
}