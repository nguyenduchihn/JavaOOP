package Chuong4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide86chuong4 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        
        //Them key va value cho hashMap
        hashMap.put("VLDC","Vat li dai cuong" );
        hashMap.put("HHDC", "Hoa hoc dai cuong");
        hashMap.put("CTDL&GT", "Cau tru du lieu va giai thuat");
        hashMap.put("PLDC", "Phap luat dai cuong");
        
        //tao 1 set ten setHashMap
        //chua toan bo cac entry (vua key vua value)
        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
        System.out.println("Cac entry co trong setHashMap: ");
        System.out.println(setHashMap);
    }
}
