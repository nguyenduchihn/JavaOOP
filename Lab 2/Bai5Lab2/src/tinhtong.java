
import java.util.Scanner;

public class tinhtong {
    public static void main(String[] args) {
        int n, sum=0;
        Scanner sc = new Scanner(System.in);
        n = 0;
        while(sum<100) {
            System.out.println("nhap cac so: ");
            n = sc.nextInt();
            sum += n;
            }
        System.out.print("Tong = " + sum);
    }
    
}
