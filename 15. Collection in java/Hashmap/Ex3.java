import java.util.*;

class Ex3 {
    public static void main(String s[]) {

        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("Ram", "March");
        hm.put("Sita", "October");
        hm.put("Mohan", "December");

        Set<String> ks = hm.keySet();

        for (String name : ks)
            System.out.println(name + ":" + hm.get(name));
    }
}