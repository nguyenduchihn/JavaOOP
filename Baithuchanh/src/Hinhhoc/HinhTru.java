package Hinhhoc;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieuCao;
    Scanner sc = new Scanner(System.in);
    public HinhTru()
    {
        ten = "Hinh Tru";
    }
    public void nhapChieuCao()
    {
        super.nhapBanKinh();
        System.out.print("Nhap chieu cao: ");
        chieuCao = sc.nextFloat();
    }
    public void tinhTheTich()
    {
        theTich = PI * banKinh * banKinh * chieuCao;
    }
    
}
