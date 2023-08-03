import java.util.*;

public class Ex2 {
    public static void main(String s[]) {
        HashSet h = new HashSet();

        h.add("A");
        h.add("B");
        h.add("C");
        h.add(null);
        h.add(10);
        h.add("q");
        h.add("&");
        h.add("**");

        //Duplicates not allowed throw error
        h.add("A");

        
        System.out.println(h);
    }
}