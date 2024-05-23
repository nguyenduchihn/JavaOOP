package Chuong4.Slide3chuong4;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Student {
    private String FullName;
    private int Age;
    public Student() {
    }
    public Student (String FullName, int Age) {
        this.FullName = FullName;
        this.Age = Age;
    } 
    public String getFullName() {
        return FullName;
    }
    public void setFullName() {
        this.FullName = FullName;
    }
    public int getAge() {
        return Age;
    }
    public void setAge() {
        this.Age = Age;
    }
    public void EnterData() {
        System.out.println("Nhap thong tin sinh vien:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien: ");
        FullName = sc.nextLine();
        System.out.print("Nhap tuoi sinh vien: ");
        Age = sc.nextInt(); 
    }
    //hien thi toan bo du lieu cac phan tu trong listStudent
    public static void Display(List<Student> listStudent) {
        for( int i = 0; i < listStudent.size(); i++) {
            String fName = listStudent.get(i).FullName;
            int age = listStudent.get(i).Age;
            System.out.println("Sinh vien: Ten = " + fName + ", Age = " + age + "\n");
        }
    }
    //hien thi toan bo du lieu cac phan tu trong setStudent
    public static void Display(Set<Student> setStudent) {
        for(Student std : setStudent) {
            String fName = std.FullName;
            int age = std.Age;
            System.out.println("Sinh vien: Ten = " + fName + ", Age = " + age + "\n");
        }
    }
    public static void Add(List<Student> listStudent, int n) {
        for(int i = 0; i < n ; i++) {
            Student std = new Student();
            std.EnterData();
            //add vao listStudent
            listStudent.add(std);
        }
    }
    public static void Add (Set<Student> setStudent, int n) {
        for(int i = 0; i < n ; i++) {
            Student std = new Student();
            std.EnterData();
            //add vao listStudent
            setStudent.add(std);
        }
    }
    public static void Update(List<Student> listStudent) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin muon thay doi: ");
        String fName = sc.nextLine();
        // tim kiem xem phan tu thu i co FullName = name hay khong
        for( int i = 0; i < listStudent.size(); i++) {
            if(listStudent.get(i).FullName.equals(fName)) {
                //neu tim thay thong tin trung thi nhap thong tin moi va cap nhat vao list
                Student std = new Student();
                std.EnterData();
                listStudent.set(i, std);
            }
        }
    }
    public static void Update(Set<Student> setStudent) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin muon thay doi: ");
        String fName = sc.nextLine();
        for (Student std : setStudent) {
            if (std.FullName.equals(fName)) {
                Student newStd = new Student(); 
                newStd.EnterData();
                setStudent.remove(std);
                setStudent.add(newStd);
                break;
            }
        }
    }

    public static void Delete(List<Student> listStudent) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thong tin muon xoa: ");
        String fName = sc.nextLine();
        for( int i = 0; i < listStudent.size(); i++) {
            if(listStudent.get(i).FullName.equals(fName)) 
                listStudent.remove(i);
        }
    }  
}
