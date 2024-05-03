package Chuong4;

import java.util.LinkedList;

public class Slide38chuong4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Toan");
        list.add("Van");
        list.add("Anh");
        list.add("Hoa");

        System.out.println("Sd phuong thuc addAll() ");
        System.out.println("===========================");
        LinkedList<String> list1 = new LinkedList<>();
        list1.addAll(list);
        System.out.print("list1: ");
        showList(list1);

        System.out.println("\n Sd phuong thuc retainAll() ");
        System.out.println("===========================");
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Anh");
        list1.retainAll(list2);
        System.out.println("List1: ");
        showList(list1);
        System.out.println("\n Sd phuong thuc removeAll() ");
        System.out.println("===========================");
        list.removeAll(list2);
        System.out.println("List: ");
        showList(list);
    }

    private static void showList(LinkedList<String> list) {
        for (String obj : list){
            System.out.print("\t" + obj + ", ");
        }
        System.out.println();
    }
    
}
