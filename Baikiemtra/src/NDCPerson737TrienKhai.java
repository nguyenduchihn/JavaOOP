import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NDCPerson737TrienKhai implements NDCPerson737 {
    private String fullName;
    private int age;
    private String msv;

    public NDCPerson737TrienKhai() {}

    public NDCPerson737TrienKhai(String fullName, int age, String msv) {
        this.fullName = fullName;
        this.age = age;
        this.msv = msv;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMSV() {
        return msv;
    }

    public void setMSV(String msv) {
        this.msv = msv;
    }

    public void enterData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        fullName = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age = sc.nextInt();
        System.out.println("Nhap MSV: ");
        msv = sc.next();
    }

    public static void display(List<NDCPerson737TrienKhai> listPerson) {
        for (NDCPerson737TrienKhai person : listPerson) {
            String fName = person.getFullName();
            int age = person.getAge();
            String msv = person.getMSV();
            System.out.println("FullName = " + fName + ", Age = " + age + ", MSV = " + msv);
        }
    }

    public static void display(Set<NDCPerson737TrienKhai> setPerson) {
        for (NDCPerson737TrienKhai person : setPerson) {
            String fName = person.getFullName();
            int age = person.getAge();
            String msv = person.getMSV();
            System.out.println("FullName = " + fName + ", Age = " + age + ", MSV = " + msv);
        }
    }

    public static void add(List<NDCPerson737TrienKhai> listPerson, int n) {
        for (int i = 0; i < n; i++) {
            NDCPerson737TrienKhai person = new NDCPerson737TrienKhai();
            person.enterData();
            listPerson.add(person);
        }
    }

    public static void add(Set<NDCPerson737TrienKhai> setPerson, int n) {
        for (int i = 0; i < n; i++) {
            NDCPerson737TrienKhai person = new NDCPerson737TrienKhai();
            person.enterData();
            setPerson.add(person);
        }
    }

    public static void update(List<NDCPerson737TrienKhai> listPerson) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten can thay doi: ");
        String fName = sc.nextLine();
        for (NDCPerson737TrienKhai person : listPerson) {
            if (person.getFullName().equals(fName)) {
                person.enterData();
                break;
            }
        }
    }

    public static void update(Set<NDCPerson737TrienKhai> setPerson) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten can thay doi: ");
        String fName = sc.nextLine();
        for (NDCPerson737TrienKhai person : setPerson) {
            if (person.getFullName().equals(fName)) {
                setPerson.remove(person);
                NDCPerson737TrienKhai newPerson = new NDCPerson737TrienKhai();
                newPerson.enterData();
                setPerson.add(newPerson);
                break;
            }
        }
    }

    public static void delete(LinkedList<NDCPerson737TrienKhai> linkedList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten can xoa: ");
        String fName = sc.nextLine();
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getFullName().equals(fName)) {
                linkedList.remove(i);
                break;
            }
        }
    }
}
