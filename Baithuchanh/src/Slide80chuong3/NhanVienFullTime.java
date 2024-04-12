package Slide80chuong3;
public class NhanVienFullTime extends NhanVien {
    private int ngayLamthem;
    private int loaiChucVu;
    public NhanVienFullTime(String ten) {
        this.ten = ten;
    }
    public NhanVienFullTime(String ten, int ngayLamthem) {
        this.ten = ten;
        this.ngayLamthem = ngayLamthem;
    }
    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }
    @Override
    public String loaiNhanVien() {
        return "Nhan vien toan thoi gian";
    }
    public void tinhLuong() {
        if(loaiChucVu==0) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + Configs.LUONG_LAM_THEM_MOI_NGAY * ngayLamthem;
        }
        else if(loaiChucVu==1) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + Configs.LUONG_LAM_THEM_MOI_NGAY * ngayLamthem;
        }
    }
    

}
