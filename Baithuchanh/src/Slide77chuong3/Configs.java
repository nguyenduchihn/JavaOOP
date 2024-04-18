package Slide77chuong3;

public class Configs {
    //Cau hinh so luong hinh hoc
    public static final int SO_LUONG_HINH_TOI_THIEU = 0;
    public static final int SO_LUONG_HINH_TOI_DA = 5;

    //Cac cau hinh khac
    public static final float PI = 3.14f;
    public static final float INCH_CM = 2.54f; //1 inch =2.54 cm
    public static final int DON_VI_CM = 1; 
    public static final int DON_VI_INC =2;
    public static int donVi = DON_VI_CM;

    //Phuong thuc static giup chuyen doi centimet sang inch
    public static float ChuyenCentimetSangInch(float cm) {
        float inch = cm / INCH_CM;
        return inch;
    }

    //Phuong thuc static giup chuyen doi inch sang centimet
    public static float ChuyenInchSangCentimet(float inch) {
        float cm = inch * INCH_CM;
        return cm;
    }
}
