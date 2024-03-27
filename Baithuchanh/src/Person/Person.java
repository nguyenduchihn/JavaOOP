package Person;

import java.util.Scanner;

public class Person {
    public String FullName;
    public int Age;
    public String Address;
    public int PhoneNumber;
    Scanner sc = new Scanner(System.in);
    public Person()
    {
        FullName = "";
        Age = 0;
        Address = "";
        PhoneNumber = 0;
    }
    public void EnterData()
    {
        System.out.print("FullName = ");
        FullName = sc.nextLine();
        System.out.print("Age = ");
        Age = sc.nextInt();
        System.out.print("Address = ");
        Address = sc.next();
        System.out.print("PhoneNumber = ");
        PhoneNumber = sc.nextInt();
    }
    public void Display()
    {
        System.out.println("FullName: " + FullName);
        System.out.println("Age: " + Age);
        System.out.println("Address: " + Address);
        System.out.println("PhoneNumber: " + PhoneNumber);
    } 
}
