import java.util.Scanner;

public class thang {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so (tu 1 den 12): ");
        n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.print("Thang 1");
                break;
            case 2:
                System.out.print("Thang 2");
                break;
            case 3:
                System.out.print("Thang 3");
                break;
            case 4:
                System.out.print("Thang 4");
                break;
            case 5:
                System.out.print("Thang 5");
                break;
            case 6:
                System.out.print("Thang 6");
                break;
            case 7:
                System.out.print("Thang 7");
                break;
            case 8:
                System.out.print("Thang 8");
                break;
            case 9:
                System.out.print("Thang 9");
                break;
            case 10:
                System.out.print("Thang 10");
                break;
            case 11:
                System.out.print("Thang 11");
                break;
            case 12:
                System.out.print("Thang 12");
                break;
            default:
                System.out.print("So khong hop le ");
        }

    }
    
}
