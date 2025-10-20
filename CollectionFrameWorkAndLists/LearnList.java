package CollectionFrameWorkAndLists;
import java.util.*;
public class LearnList {
    public static void main(String[] args) {
        //unlink normal array, ArrayList are dynamic size array
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);
        //size()
        System.out.println(list.size());
        //contains
        System.out.println(list.contains(10));
        //remove :- removes index when used normally(when passed int value)
        // list.remove(1);
        //to remove actual value(when passed integer value)
        // list.remove(Integer.valueOf(2));
        // System.out.println(list);
 
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(0);
        list2.add(200);

        // adding another collection to one collection        
        // list.addAll(list2);
        // System.out.println(list);

        // removing one collection from other collection.
        // list.removeAll(list2);
        // System.out.println(list);

        // clear() removes all the elements from the colletions
        // list2.clear();
        // System.out.println(list2);

        // retainAll removes element which are not present in both the collections
        list.retainAll(list2);
        System.out.println(list);

        // toArray() used to convert a list in object array.
        Object a[]=list.toArray();
        for (Object object : a) {
            Integer temp=(Integer)object;
            System.out.println(temp);
        }

    }
}
