package Z2Rough;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) throws InterruptedException {
        TreeMap m = new TreeMap();
        m.put("Pratyay",1000);
        m.put("Amrit",1200);
        m.put("Pranay",3000);
        m.put("Ravi",800);
        System.out.println(m);
        m.put("Ravi",900);
        System.out.println(m);
        System.out.println(m.keySet());
        System.out.println(m.values());

        System.out.println(m.entrySet());

        Iterator itr = m.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry m1 = (Map.Entry) itr.next();
            System.out.println(m1.getKey()+" "+m1.getValue());
            if (m1.getValue().equals(1000)){
                m1.setValue((int)m1.getValue()+300);
            }
        }

        System.out.println(m);

        HashMap hashMapm = new HashMap();
        StringBuffer sb1 = new StringBuffer("prat");
        StringBuffer sb2 = new StringBuffer("prat");

        hashMapm.put(sb1,1000);
        hashMapm.put(sb2,1300);

        System.out.println(hashMapm);

        WeakHashMap hm = new WeakHashMap();
        Temp t = new Temp();
        hm.put(t,"durga");
        System.out.println(hm);
        t=null;

        System.gc();

        Thread.sleep(5000);

        System.out.println(hm);


    }

}
