import java.util.Scanner;

/**
 * tinhtong
 */
public class Slide30chuong2 {

    public static void main(String[] args) {
        int n, tong, sodu;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        n = sc.nextInt();
        tong=0;
        while (n>0) {
            sodu = n%10;
            n = n/10;
            tong += sodu;
        }
        System.out.println("Tong cac chu so la: "+ tong);
    }
}