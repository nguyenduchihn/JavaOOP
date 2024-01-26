import java.util.Scanner;

public class Slide35chuong2 {
    public static void main(String[] args) {
        double a, b, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextDouble();
        System.out.println("Nhap b: ");
        b = sc.nextDouble();
        min = a;
        if(a>b){
            min = b;
            System.out.println("So nho nhat la: "+ min);
        }
        else if(a==b){
            min = a = b;
            System.out.println("Hai so bang nhau bang "+ min);
        }
    }
    
}
