import java.util.Scanner;

/**
 * xachdinhdotuoi
 */
public class xacdinhdotuoi {
    public static void main(String[] args) {
        int tuoi, namsinh;
        String ten;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten: ");
        ten = sc.nextLine();
        System.out.print("nhap nam sinh: "); 
        namsinh = sc.nextInt();
        sc.close();
        tuoi = 2024 - namsinh;
        if(tuoi < 16)
            System.out.print("Ban " + ten + " o do tuoi vi thanh nien");
        else if( tuoi >= 16 && tuoi <18) {
            System.out.print("Ban " + ten + " o do tuoi truong thanh");
        }
        else {
            System.out.print("Ban " + ten + " da gia");
        }
    }
}
