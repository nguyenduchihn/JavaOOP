import java.util.Scanner;

public class Employee {
    Scanner sc = new Scanner(System.in);
    public int idNV;
    public String hoTenNV;
    public String viTriNV;
    public int namLamviec;
    public int luong = 5000;
    public void nhapThongTinNV()
    {
        System.out.println("Nhap thong tin nhan vien: ");
        System.out.println("Ma nhan vien: ");
        idNV = sc.nextInt();
        System.out.println("Ho va ten nhan vien: ");
        hoTenNV = sc.next();
        System.out.println("Vi tri lam viec: ");
        viTriNV = sc.next();
        System.out.println("Nam gan bo lam viec: ");
        namLamviec = sc.nextInt();
    }
    public void tinhLuong(int namLamviec)
    {
        if(namLamviec<2)
            luong += 100;
        else if(namLamviec<5)
            luong += 300;
        else if(namLamviec<10)
            luong += 600;
        else 
            luong +=1000;
    }
    public void xuatThongTinNV()
    {
        System.out.println("Hien thi thong tin nhan vien la: ");
        System.out.println("Ma nhan vien: " + idNV);
        System.out.println("Ho va ten nhan vien: " + hoTenNV);
        System.out.println("Vi tri lam viec: " + viTriNV);
        System.out.println("Nam gan bo lam viec: " + namLamviec);
        System.out.println("Luong nhan vien: " + luong);
    }

    jsdhfjk
}
