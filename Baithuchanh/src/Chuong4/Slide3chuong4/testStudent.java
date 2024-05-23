package Chuong4.Slide3chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class testStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arrayListStudent = new ArrayList<>();
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        Student.Add(arrayListStudent, n);
        System.out.println("Danh sach sinh vien:");
        Student.Display(arrayListStudent);

        Student.Update(arrayListStudent);
        System.out.println("Danh sach sinh vien sau khi cap nhat: ");
        Student.Display(arrayListStudent);
        
        Student.Delete(arrayListStudent);
        System.out.println("Danh sach sinh vien sau khi xoa");
        Student.Display(arrayListStudent);
    }   
    
}
