
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class NDCPerson737KeThua extends NDCPerson737TrienKhai {
    private String diaChi;

    @Override
    public void enterData() {
        Scanner sc = new Scanner(System.in);
        super.enterData();
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine();
    }

    @Override
    public void display(List<NDCPerson737TrienKhai> listPerson) {
        super.display(listPerson);
        System.out.println("Dia chi = " + diaChi);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<NDCPerson737TrienKhai> listPerson = new ArrayList<>();
        
        NDCPerson737KeThua ps = new NDCPerson737KeThua();
        ps.enterData();
        listPerson.add(ps); 
        ps.display(listPerson);
    }
}
