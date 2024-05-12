import java.util.LinkedList;
import java.util.Scanner;

public class Bai2Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedListInteger = new LinkedList<>();

        //Nhap n so nguyen
        System.out.println("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.println("Phan tu thu " + (i+1) + " la: " );
            int values = sc.nextInt();
            linkedListInteger.add(values);
        }

        //Tinh tong va so luong so chan
        int sum = 0;
        int count = 0;
        for (int x : linkedListInteger) {
            if(x % 2 ==0) {
                sum += x;
                count ++;
            }
        }

        //Tinh trung binh cong cac so chan
        double TBC = 0;
        if(count > 0) 
            TBC = (double) sum/count;
        
        //Hien thi ket qua
        System.out.println("Trung binh cong cac so chan la: " + TBC);
    }
}
