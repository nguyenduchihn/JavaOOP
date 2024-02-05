import java.util.Scanner;

public class Bai11Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, doi;
        do {
            System.out.println("nhap so phan tu mang : ");
            n = sc.nextInt();
        }while(n<=0);
        int A [] = new int[n];
        for (int i=0; i<n; i++){
            System.out.println("so phan tu thu "+ (i+1) + " la: ");
            A [i] = sc.nextInt();
        }
        System.out.println("mang ban dau nhap: " );
            for (int i=0; i<n; i++)
                System.out.println(A[i]);
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (A[i] > A[j]) {
                    doi = A[i];
                    A[i] = A[j];
                    A[j] = doi;
                }
            }
        }
        System.out.println("mang sau khi sap xep la: ");
            for ( int i=0; i<n; i++) 
                System.out.println(A[i]);
        sc.close();
    }
}
