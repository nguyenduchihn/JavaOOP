package Person;

import java.util.Scanner;

public class Person {
    public String FullName;
    public int Age;
    public String Sex;
    public String Address;
    public int SDT;
    Scanner sc = new Scanner(System.in);
    public Person()
    {
        FullName = "";
        Age = 0;
        Address = "";
        SDT = 0;
    }
    public void EnterData()
    {
        System.out.println("FullName = ");
        FullName = sc.nextLine();
        System.out.println("Age = ");
        Age = sc.nextInt();
        System.out.println("Address = ");
        Address = sc.next();
        System.out.println("So dien thoai = ");
        SDT = sc.nextInt();
    }
    public void Display()
    {
        System.out.println(FullName + " - " + Age + " - " + Sex + " - " + Address);
    } 
}
