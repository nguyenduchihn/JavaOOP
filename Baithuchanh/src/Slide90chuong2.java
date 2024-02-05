import java.util.Scanner;

public class Slide90chuong2 {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        chuoi = sc.nextLine();
        System.out.print("Cac ky tu trong chuoi la: ");
        for (int i=0; i< chuoi.length(); i++){
            kyTu = chuoi.charAt(i);
            System.out.print(kyTu);
        }
        sc.close();
    }
    
}
