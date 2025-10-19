package CollectionFrameWorkAndLists;
import java.util.*;
public class LearnList {
    public static void main(String[] args) {
        //unlink normal array, ArrayList are dynamic in size
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);
        //size()
        System.out.println(list.size());
        //contains
        System.out.println(list.contains(10));
        //remove :- removes index when used normally
        list.remove(1);
        //to remove actual value
        list.remove(Integer.valueOf(2));
        System.out.println(list);
    }
}
