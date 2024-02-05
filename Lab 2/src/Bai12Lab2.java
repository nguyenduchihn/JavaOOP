import java.util.Scanner;

public class Bai12Lab2 {
    public static void main(String[] args) {
        int hangNgang, hangDoc;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu cua hang ngang mang 2 chieu: ");
        hangNgang = sc.nextInt();
        System.out.print("nhap so phan tu cua hang doc mang 2 chieu: ");
        hangDoc = sc.nextInt();
        int [][] mangHaiChieu = new int[hangNgang][hangDoc];
            for(int i = 0; i < mangHaiChieu.length; i++){
                for(int j = 0; j < mangHaiChieu[i].length; j++){
                    System.out.print("Nhap gia tri cho phan tu [" + (i+1) + "] ["+ (j+1) + "] la: ");
                    mangHaiChieu[i][j] = sc.nextInt();
                }
            }
        int max = mangHaiChieu[0][0];
        for(int i = 0; i < mangHaiChieu.length; i++){
                for(int j = 0; j < mangHaiChieu[i].length; j++){
                    if(mangHaiChieu[i][j] >= max){
                        max = mangHaiChieu[i][j];
                    }
                }
        }
        System.out.println("Gia tri lon nhat cua mang la: " + max);
        sc.close();
    }
}
