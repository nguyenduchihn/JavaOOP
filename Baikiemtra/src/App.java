import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<NDCPerson737TrienKhai> ps = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        int n = sc.nextInt();
        NDCPerson737TrienKhai.add( ps, n);
        System.out.println("Danh sach sinh vien: ");
        NDCPerson737TrienKhai.display(ps);

        NDCPerson737TrienKhai.update(ps);
        System.out.println("Danh sach sinh vien sau khi sua: ");
        NDCPerson737TrienKhai.display(ps);

        NDCPerson737TrienKhai.delete(ps);
        System.out.println("Danh sach sinh vien sau khi xoa: ");
        NDCPerson737TrienKhai.display(ps);

    }
}
