package org.prog.coll;

import java.util.HashMap;
import java.util.Map;

public class CollectionsMapMain {

    public static void main(String... args) {
        HashMap<String, String> planeSits = new HashMap();

        planeSits.put("48C", "Elton John");
        planeSits.put("25B", null);
        planeSits.put("11C", "By Myself");

//        planeSits.put("24C", null);

        for (Map.Entry e : planeSits.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }



    }
}
