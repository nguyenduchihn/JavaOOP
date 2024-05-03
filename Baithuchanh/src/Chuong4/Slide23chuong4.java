package Chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class Slide23chuong4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Nhap so phan tu cua arrList: ");
        n = sc.nextInt();
        for ( int i = 0; i < n; i++ ) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            int numberData = sc.nextInt();
            arrayListInteger.add(numberData);
        }
        int max = arrayListInteger.get(0);
        for ( int i = 0; i < arrayListInteger.size(); i++) {
            if(arrayListInteger.get(i).compareTo(max) > 0)
                max = arrayListInteger.get(i);
        }
        System.out.println("Phan tu lon nhat trong arrListString la: " + max);
    }  
}
