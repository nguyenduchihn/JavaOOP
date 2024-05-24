package Chuong4.List;

import java.util.Scanner;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> linkedListStudents = new LinkedList<>();

        System.out.print("Nhap so luong sinh vien : ");
        int soLuong = sc.nextInt();
        Student.ThemSinhVien(linkedListStudents, soLuong);
        Student.SuaThongTin(linkedListStudents);
        Student.XoaThongTin(linkedListStudents);
        Student.Display(linkedListStudents);
    }
}