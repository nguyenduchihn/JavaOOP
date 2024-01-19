import java.util.Scanner;

/**
 * chanle
 */
public class chanle {

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("a =");
        a = sc.nextInt();
        if(a % 2 == 0)
            System.out.print(a + "la so chan");
        if(a % 2 == 1) 
            System.out.print(a + "la so le");
    }
}