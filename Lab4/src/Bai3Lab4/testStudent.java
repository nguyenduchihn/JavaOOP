package Bai3Lab4;

import java.util.LinkedList;
import java.util.Scanner;
public class testStudent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> students = new LinkedList<>();

        // Thêm sinh viên
        String name;
        double score;
        do {
            System.out.print("Nhap ten sinh vien: ");
            name = sc.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Nhap diem sinh vien: ");
            score = sc.nextDouble();
            sc.nextLine(); 
            students.add(new Student(name, score));
        } while (true);

        // Dem va hien thi sinh vien thi lai
        int count = 0;
        System.out.println("\nSinh vien phai thi lai:");
        for (Student x : students) {
            if (x.getScore() <= 5) {
                System.out.println(x);
                count++;
            }
        }
        System.out.println("Tong so sinh vien thi lai: " + count);

        // Hien thi sinh vien co diem thi cao nhat
        double highestScore = students.getFirst().getScore();
        LinkedList<Student> studentsWithHighestScore = new LinkedList<>();
        studentsWithHighestScore.add(students.getFirst());
        for (Student x : students.subList(1, students.size())) {
            if (x.getScore() > highestScore) {
                highestScore = x.getScore();
                studentsWithHighestScore.clear();
                studentsWithHighestScore.add(x);
            } else if (x.getScore() == highestScore) {
                studentsWithHighestScore.add(x);
            }
        }
        System.out.println("\nSinh vien co diem cao nhat:");
        for (Student x : studentsWithHighestScore) {
            System.out.println(x);
        }

        // Tim kiem sinh vien theo ten
        System.out.print("\nNhap ten sinh vien can tim: ");
        name = sc.nextLine();
        Student foundStudent = null;
        for (Student x : students) {
            if (x.getName().equalsIgnoreCase(name)) {
                foundStudent = x;
                break;
            }
        }
        if (foundStudent != null) {
            System.out.println("\nSinh vien duoc tim thay:");
            System.out.println(foundStudent);
        } else {
            System.out.println("Khong tim thay sinh vien voi ten " + name);
        }
    }
}
