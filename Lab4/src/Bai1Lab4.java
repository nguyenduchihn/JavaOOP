
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Bai1Lab4
 */
public class Bai1Lab4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayListInt = new ArrayList<>();
        System.out.println("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.println("Phan tu thu " + (i+1) + " la: " );
            int values = sc.nextInt();
            arrayListInt.add(values);
        }

        //Tim max
        int max = arrayListInt.get(0);
        for (int x : arrayListInt) 
            if(x > max) {
                max = x;
                System.out.println("So lon nhat la: " + max);
            }
            
        //Cach 2:
        // arrayListInt.sort((o1,o2)->(o2-o1));
        // System.out.println("So nguyen lon nhat la: " + arrayListInt.get(0));
        
        //Nhap so nguyen can xoa
        System.out.println("Nhap so nguyen: ");
        int values = sc.nextInt();

        //Xoa so nguyen
        if(arrayListInt.contains(values)) {
            for(int i= 0; i< arrayListInt.size(); i++)
                if(arrayListInt.get(i) == values)
                    arrayListInt.remove(i);
            System.out.println("Xoa du lieu thanh cong!");
            System.out.println(arrayListInt);
            System.out.println();
        } else {
            System.out.println("Phan tu " + values + " khong ton tai");
        }

        //Sap xep day so
        arrayListInt.sort((o1,o2)->(o1-o2));
        System.out.println("Day so duoc sap xep la: " + arrayListInt);
        
    }
}
    