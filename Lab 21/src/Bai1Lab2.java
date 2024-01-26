import java.util.Scanner;

public class Bai1Lab2 {
    public static void main(String[] args) {
        double a, b, Tong, Hieu, Tich, Thuong, Chiadu;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a =");
        a = sc.nextDouble();
        System.out.print("nhap b =");
        b = sc.nextDouble();
        Tong = a + b;
        System.out.print("Tong = " + Tong);
        Hieu = a - b;
        System.out.print("Hieu = " + Hieu);
        Tich = a * b;
        System.out.print("Tich = " + Tich);
        Thuong = a / b;
        System.out.print("Thuong = " + Thuong);
        Chiadu = a % b;
        System.out.print("Chiadu = " + Chiadu);
        if (a>b){
            System.out.print("ket qua " + a + ">" + b);
        } else if(a==b) {
            System.out.print("ket qua " + a + "=" + b);
        } else {
            System.out.print("ket qua " + a + "<" + b);
        }
    }
    
}
