package Chuong4;

import java.util.LinkedHashMap;
import java.util.Map;

public class Slide94chuong4 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> tp = new LinkedHashMap<Integer, String>();

        tp.put(1, "Thanh");
        tp.put(2, "Pho");
        tp.put(3, "Ha");
        tp.put(4, "Noi");

        for(Map.Entry<Integer, String> x:tp.entrySet())
            System.out.println(x.getKey() + " " + x.getValue());

        System.out.println("Ten thanh pho truoc khi bi xoa: " + tp);
        tp.remove(1);
        System.out.println("Ten thanh pho sau khi bi xoa: " + tp);
    }
}
