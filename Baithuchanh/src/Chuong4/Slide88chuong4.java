package Chuong4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide88chuong4 {
    public static void main(String[] args) {
        HashMap<String, String> hashMapLaqptop = new HashMap<>();

        //Them DL key va value vao trong hashMapLaptop
        hashMapLaqptop.put("LE","Lenovo");
        hashMapLaqptop.put("AS", "Asus");
        hashMapLaqptop.put("AC", "Acer");
        hashMapLaqptop.put("DE", "Dell");

        //Tao 1 set ten setLaptop va chua cac entry 
        System.out.println("Danh sach cac laptop co trong hashMapLaptop: ");
        Set<Map.Entry<String, String>> setLaptop = hashMapLaqptop.entrySet();
        System.out.println(setLaptop);

        // //Lay Laptop co ma la AS va hien thi ten Laptop
        System.out.println("AS: " + hashMapLaqptop.get("AS"));
        
        // //Lay Laptop co ma la AP va vi trong hashMapLaptop khong co DL do nen ket qua se tra gia tri null
        System.out.println("AP: " + hashMapLaqptop.get("AP"));

        // //De kiem tra mot ten Laptop co trong hashMapLaptop hay khong thi ta su dung containsValue
        if(hashMapLaqptop.containsValue("Acer")) 
            System.out.println("Co Laptop Acer trong hasMapLaptop");
    }    
}
