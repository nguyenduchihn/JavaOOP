import java.util.Scanner;
public class phuongtrinhbacnhat {
    public static void main(String[] args) {
        double a, b, nghiem;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a =");
        a = sc.nextDouble();
        System.out.print("nhap b =");
        b = sc.nextDouble();
        System.out.println("phuong trinh vua nhap la:" + a +"x +" + b + "= 0");
        if(a==0){
            if(b==0){
                System.out.println("phuong trinh vo so nghiem");}
            else {
                System.out.println("phuong trinh vo nghiem");
            }
        }
        else {
            nghiem = (double) -b / a;
            System.out.println("phuong trinh co nghiem la: " + nghiem);
        }
    }
}
