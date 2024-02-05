import java.util.Scanner;

public class Slide74chuong2 {
    public static void main(String[] args) {
    int n, i, sum=0;
    Scanner sc = new Scanner(System.in);
    sc.close();
    do{
        System.out.println("nhap so phan tu cua mang la: ");
        n = sc.nextInt();
    }while(n<0);
    int [] A = new int[n];
    for( i=0; i<n; i++){
        System.out.println("nhap phan tu thu " + (i+1) + "cua mang la: ");
        A[i] =sc.nextInt();
    }
    for( i=0; i<n; i++){
        if (A[i]%2==0)
            sum += A[i];
    }
    System.out.print("Tong cac so chan la: "+sum);
    }
    
}
