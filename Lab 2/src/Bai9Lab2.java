import java.util.Scanner;

public class Bai9Lab2 {
    public static void main(String[] args) {
        int dem=0;
        String chuoi;
        char kyTu;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chuoi bat ky: ");
        chuoi = sc.nextLine();
        for(int i =0; i<chuoi.length(); i++){
            kyTu = chuoi.charAt(i);
            System.out.println(kyTu);
            dem++;
        }
        System.out.println("So ky tu trong chuoi la: " + dem);
        sc.close();
    }
    
}
