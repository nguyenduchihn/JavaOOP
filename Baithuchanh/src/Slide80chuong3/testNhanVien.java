package Slide80chuong3;

public class testNhanVien {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Nguyen Van Sep");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyen Thi Linh", 5);
        NhanVienFullTime linh2 = new NhanVienFullTime("Tran Van Linh");
        NhanVienPartTime thoivu = new NhanVienPartTime("Luu Van Vu", 300);
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoivu.tinhLuong();
        //xuat thong tin
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoivu.xuatThongTin();
    }
    
}
