import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Bai5Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, SinhVien> studentHashMap = new HashMap<>();

        // So phan tu student
        System.out.print("Enter size student : ");
        int numberStudent = sc.nextInt();
        System.out.println();

        typeInfoStudent(studentHashMap, numberStudent);

        System.out.print("Enter id class : ");
        String idClass = sc.next();
        System.out.println("Student in the class " + idClass + " is : ");
        Set<Map.Entry<String, SinhVien>> setHashMap = studentHashMap.entrySet();

        for(Map.Entry<String, SinhVien> setEntry : setHashMap) {
            if (setEntry.getValue().getClassId().equals(idClass)) {
                setEntry.getValue().showInfo();
            }
        }

        // Hien thi tat ca sinh vien
        System.out.print("Enter id student : ");
        String idStudent = sc.next();
        
        if (!studentHashMap.containsKey(idStudent)) {
            System.out.println("Student not to be in the Map...");
        } else {
            System.out.println("Information of student : ");
            studentHashMap.get(idStudent).showInfo();
        }
    }

    // Thong tin sinh vien
    public static void typeInfoStudent(HashMap<String, SinhVien> studentHashMap, int numberStudent) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < numberStudent; i++) {
            SinhVien newStudent = new SinhVien();

            System.out.println("Enter information of student number " + (i + 1));
            System.out.print("Enter StudentId : ");
            String IdStudent = sc.next();
            newStudent.setStudentId(IdStudent);

            System.out.print("Enter Name : ");
            String nameStudent = sc.next();
            newStudent.setFullName(nameStudent);

            System.out.print("Enter Id class : ");
            String idClass = sc.next();
            newStudent.setClassId(idClass);

            studentHashMap.put(newStudent.getStudentId(), newStudent);
            System.out.println();
        }
    }
}

// Class Student
class SinhVien {
    // Thuoc tinh
    private String studentId;
    private String fulllName;
    private String classId;

    // Phuong thuc
    public SinhVien() {
        studentId = "";
        fulllName = "";
        classId = "";
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setFullName(String fullName) {
        this.fulllName = fullName;
    }
    public void setClassId(String classId) {
        this.classId = classId;
    }
    public String getStudentId() {
        return studentId;
    }
    public String getFullName() {
        return fulllName;
    }
    public String getClassId() {
        return classId;
    }

    public void showInfo() {
        System.out.println();
        System.out.println("ID : " + studentId);
        System.out.println("Name : " + fulllName);
        System.out.println("Class : " + classId);
        System.out.println();
    }
}