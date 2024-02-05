import java.util.Scanner;

public class Bai6Lab2 {
    public static void main(String[] args) {
        int n, i=1;
        long  giaithua = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so: ");
        n = sc.nextInt();
        do{   
            giaithua *=i;
            i++;
        }while(i<=n);
        System.out.print("giai thua cua " + n + " bang " + giaithua  );
        sc.close();
    }
    
}
