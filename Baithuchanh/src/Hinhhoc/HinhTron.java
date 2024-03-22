package Hinhhoc;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float banKinh;
    Scanner sc = new Scanner(System.in);
    public HinhTron()
    {
        ten = "Hinh Tron";
    }
    public void nhapBanKinh()
    {
        System.out.print("Nhap ban kinh: ");
        banKinh = sc.nextFloat();
    }
    public void tinhChuVi()
    {
        chuVi = 2 * banKinh * PI;
    }
    public void tinhDienTich()
    {
        dienTich = banKinh * banKinh * PI;
    }
}
