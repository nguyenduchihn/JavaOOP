package Slide72chuong3;

public class MainClass {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.setTen("");
        sv1.setTuoi(23);
        sv2.setTen("Peter");
        sv2.setTuoi(17);
        System.out.println("Sinh vien 1 co ten: " + sv1.getTen() + ", tuoi: " + sv1.getTuoi());
        System.out.println("Sinh vien 2 co ten: " + sv2.getTen() + ", tuoi: " + sv2.getTuoi());
    }
}
