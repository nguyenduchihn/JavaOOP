import java.util.Scanner;

public class Bai8Lab2 {
    public static void main(String[] args) {
        int n;
        float tbc, sum=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("nhap so phan tu mang: ");
            n = sc.nextInt();
        }while(n<=0);
        int A[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("nhap so thu "+(i + 1)+": ");
            A[i] = sc.nextInt();
            sum += A[i];
        }
        tbc = sum / n;
        System.out.println("tbc =" + tbc);   
        sc.close();
    }
    
}