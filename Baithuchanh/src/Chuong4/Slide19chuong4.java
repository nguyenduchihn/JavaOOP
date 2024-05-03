package Chuong4;

import java.util.ArrayList;

import java.util.Iterator;

public class Slide19chuong4 {
    public static void main(String[] args) {
        ArrayList<Float> arrayListFloat = new ArrayList<>();
        arrayListFloat.add(0.7f);
        arrayListFloat.add(7.26f);
        arrayListFloat.add(1.02f);
        arrayListFloat.add(9.3f);
        Iterator <Float> iterator = arrayListFloat.iterator();
        System.out.println("Cac phan tu co trong arrListFloat la: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "\t");
            
        }
    }  
}
