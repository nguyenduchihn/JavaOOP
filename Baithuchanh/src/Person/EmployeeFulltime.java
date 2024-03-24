package Person;

public class EmployeeFulltime extends Employee {
    public int day;
    public int year;
    public EmployeeFulltime()
    {
        position = "Full time";
        day = 0;
        year = 0;
    }
    public void EnterData ()
    {
        super.EnterData();
        System.out.println("So nam lam viec o cong ty: ");
        year = sc.nextInt();
        System.out.println("So ngay lam viec: ");
        day = sc.nextInt();
    }
    public void salary()
    {
        if (year<2)
            salary = salary * day * 11 + 100000;
        else if (year<5) {
            salary = salary * day * 11 + 300000;
        }
        else 
            salary = salary * day * 11 + 500000;
    }
    public void Display ()
    {
        super.Display();
        System.out.println("So nam lam viec o cong ty: " + year);
    }
}
