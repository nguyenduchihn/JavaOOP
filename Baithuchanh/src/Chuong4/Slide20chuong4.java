package Chuong4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Slide20chuong4 {
    public static void main(String[] args) {
        ArrayList<Character> arrayListChar = new ArrayList<>();
        arrayListChar.add('a');
        arrayListChar.add('e');
        arrayListChar.add('b');
        arrayListChar.add('c');
        ListIterator<Character> listIterator = arrayListChar.listIterator();
        System.out.println("Cac phan tu co trong arrListChar la: ");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + "\t");   
        }
    } 
}
