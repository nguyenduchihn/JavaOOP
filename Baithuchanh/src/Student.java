import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    public String hoTen;
    public String diaChi;
    public int namSinh;
    public double diemToan, diemVan, diemAnh, DTB;
    public void nhapThongTin()
    {
        System.out.println("Nhap Thong tin hoc sinh: ");
        System.out.print("Ho va ten ");
        hoTen = sc.nextLine();
        System.out.print("Nam sinh: ");
        namSinh = sc.nextInt();
        System.out.print("Dia chi: ");
        diaChi = sc.next();
        System.out.print("Diem Toan: ");
        diemToan = sc.nextDouble();
        System.out.print("Diem Van: ");
        diemVan = sc.nextDouble();
        System.out.print("Diem Anh: ");
        diemAnh = sc.nextDouble();
    }
    public void tinhDiemTrungBinh()
    {
        DTB= (diemToan + diemAnh + diemVan)/3 * 1d;
    }
    public void xuatThongTin()
    {
        System.out.println("Hien thi thong tin hoc sinh la: ");
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Diem tong ket trung binh:" + DTB);
    }


    


    
}
