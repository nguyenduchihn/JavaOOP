package Chuong4;

import java.util.LinkedList;
import java.util.Scanner;

public class Slide41chuong4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> linkedListString = new LinkedList<>();
        for (int i = 1; i<=12; i++) {
            linkedListString.add("Thang " + i);
        }

        System.out.println("Nhap vao chi so cua phan tu can lay: ");
        int index = sc.nextInt();
        if((index < 0) && (index > (linkedListString.size() - 1)))
            System.out.println("Chi so can lay phai lon hon 0 va nho hon " + (linkedListString.size() - 1));
        else {
            String node = linkedListString.get(index);
            System.out.println("Phan tu co chi so = " + index + " trong linkedList la: " + node);
        }
        String firstNode = linkedListString.getFirst();
        String lastNode = linkedListString.getLast();
        System.out.println("\nPhan tu dau tien trong danh sach la: " + firstNode + "; Phan tu cuoi cung trong danh sach la: " + lastNode);        
    }
}
