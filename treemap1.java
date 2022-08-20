import java.util.TreeMap;

/**
 * treemap1
 */
public class treemap1 {

    public static void main(String[] args) {
        TreeMap <Integer ,Integer>tm = new TreeMap<>();
        tm.ceilingEntry(55);
        tm.entrySet();
        tm.put(2, 666);
        tm.put(22, 666);
        tm.put(5, 666);
        System.out.println(tm.size());
        tm.values();
        System.out.println(tm);
    }
}