
import java.util.Scanner;

public class Bai5Lab2 {
    public static void main(String[] args) {
        int n, sum=0;
        String strResoult =" ";
        Scanner sc = new Scanner(System.in);
        n = 0;
        while(sum<100) {
            System.out.println("nhap cac so: ");
            n = sc.nextInt();
            sum += n;
            strResoult = strResoult + n + " + ";
            }
        strResoult= strResoult.substring(0,strResoult.length()-2);
        System.out.print("Tong = " + sum);
    }
    
}
