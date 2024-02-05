import java.util.Scanner;

public class Bai10Lab2 {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        int dem =0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("nhap chuoi: ");
            chuoi = sc.nextLine();
        }while(chuoi.length()>80);
        System.out.println("nhap ky tu dac biet: ");
        kyTu = sc.next().charAt(0);
        for( int i =0 ; i<chuoi.length() ; i++)
            if ( kyTu == chuoi.charAt(i) )
                dem ++;
        System.out.println("So ky tu "+ kyTu + "xuat hien trong chuoi "+ chuoi + "=" + dem);
        sc.close();
    }    
}
