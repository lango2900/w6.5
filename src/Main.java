import java.util.TreeMap;
import java.util.SortedMap;


public class Main {
    public static void main(String[] args) {

        SortedMap<String, Integer> wimp = new TreeMap<>();
        wimp.put("epsilon",5);
        wimp.put("iota",9);
        wimp.put("delta",4);
        wimp.put("zeta",6);
        wimp.put("alpha",1);
        wimp.put("beta",2);
        wimp.put("eta",7);
        wimp.put("gamma",3);
        wimp.put("theta",4);
        System.out.println("SortedMap: " + wimp);

        System.out.println("First Key: " + wimp.firstKey());
        System.out.println("Last Key: " + wimp.lastKey());
        int value = wimp.remove("zeta");
        System.out.println("Removed Value: " + value);

        wimp.put("lambda",11);
        wimp.put("mu",12);
        wimp.put("kappa",10);
        System.out.println("SortedMap: " + wimp);


    }
}