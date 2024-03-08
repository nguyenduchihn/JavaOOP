import java.util.Scanner;

public class Sile16chuong3 {
    //khai bao lop hinh tron
    class hinhTron {
        //cac thuoc tinh
        final float PI = 3.14f;
        float r;
        float cv;
        float dt;

        //cac phuong thuc
        void nhapBanKinh()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ban kinh hinh tron = ");
            r = sc.nextFloat();
            sc.close();
        }
        
        void tinhChuVi()
        {
            cv = 2 * PI * r;
        }

        void tinhDienTich()
        {
            dt = PI * r* r;
        }

        void inChuVi()
        {
            System.out.println("Chu vi hinh tron: " + cv);
        }

        void inDienTich()
        {
            System.out.println("Dien tich hinh tron: " + dt);
        }
    }
    public static void main(String[] args) {
        hinhTron abc = new Sile16chuong3(). new hinhTron();
        abc.nhapBanKinh();
        abc.tinhChuVi();
        abc.tinhDienTich();
        abc.inChuVi();
        abc.inDienTich();
    }
    
}
