import java.util.Scanner;
public class phuongtrinhbachai {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a =");
        a = sc.nextDouble();
        System.out.print("nhap b =");
        b = sc.nextDouble();
        System.out.print("nhap c =");
        c = sc.nextDouble();
        if(a==0){
            System.out.println("phuong trinh khong phai la phuong trinh bac 2");
        }
        else {
            delta = Math.pow(b, 2) - 4 * a * c;
            if(delta < 0)
                System.out.println("phuong trinh vo nghiem");
            else if(delta == 0) {
                x1 = x2 = - b / (2 * a);
                System.out.println("phuong trinh co nghiem kep la:" + x1); }
            else{
                x1 = (- b + Math.sqrt(delta)) / (2 * a);
                x2 = (- b - Math.sqrt(delta)) / (2 * a);
                System.out.println("phuong trinh co hai nghiem phan biet la:" + "x1 =" + x1 + ";" + "x2 =" + x2);
            }
        }
    }
}
