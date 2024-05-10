package Chuong4;

import java.util.HashSet;
import java.util.Scanner;

public class Slide54chuong4 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        //Them cac phan tu
        hashSetString.add("Nguyen Van A");
        hashSetString.add("Tran Van B");
        hashSetString.add("Le Thi C");
        hashSetString.add("Dang Van D");

        //Hien thi
        System.out.println("Danh sach ten trong hashSetString: ");
        System.out.println(hashSetString);
        System.out.println("Ten can them: ");
        name = sc.nextLine();
        
        //Them phan tu
        if (!hashSetString.contains(name)) {
            hashSetString.add(name);
            System.out.println("Them thanh cong");
            System.out.println("Cac phan tu sau khi them trong hashSetString: ");
            System.out.println(hashSetString);
        } else {
            System.out.println("Phan tu " + name + " da ton tai! ");
        }
    }
}
