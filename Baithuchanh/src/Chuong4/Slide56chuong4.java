package Chuong4;

import java.util.HashSet;
import java.util.Scanner;

public class Slide56chuong4 {
    public static void main(String[] args) {
        int n;
        HashSet<Integer> hashSetInt = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        //Them cac phan tu
        hashSetInt.add(4);
        hashSetInt.add(5);
        hashSetInt.add(7);
        hashSetInt.add(2);

        //Hien thi
        System.out.println("Cac phan tu trong hachSetInt: ");
        System.out.println(hashSetInt);
        System.out.println("Phan tu can xoa");
        n = sc.nextInt();

        //Xoa phan tu
        if(hashSetInt.contains(n)) {
            hashSetInt.remove(n);
            System.out.println("Cac phan tu trong hashSetInt sau khi xoa: ");
            System.out.println(hashSetInt);
        } else {
            System.out.println("Phan tu " + n + " khong ton tai!");
        }
    }
    
}
