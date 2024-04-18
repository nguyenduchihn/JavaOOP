package Slide71chuong3;

public class MainClass {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.setBanKinh();
        float chuVi = ht.tinhChuVi();
        float dienTich = ht.tinhDienTich();
        System.out.println("Chu vi hinh tron: " + chuVi);
        System.out.println("Dien tich hinh tron: " + dienTich);
    }
    
}
