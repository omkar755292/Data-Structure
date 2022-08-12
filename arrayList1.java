import java.util.ArrayList;
import java.util.Collections;

public class arrayList1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<>();
        list.add(0);
        list.add(6);
        list.add(53);
        System.out.println(list);
        System.out.println(list.get(1));
        list.add(1,55);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        // list.removeAll(list);
        // System.out.println(list);
        list.add(10);
        list.add(65);
        list.add(553);
        Collections.sort(list);
        System.out.println(list);
        }
}