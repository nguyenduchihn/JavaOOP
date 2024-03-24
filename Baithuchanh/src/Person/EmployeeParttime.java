package Person;

public class EmployeeParttime extends Employee {
    public int hour;
    public EmployeeParttime()
    {
        position = "Part time";
        hour = 0;
    }
    public void EnterData()
    {
        super.EnterData();
        System.out.println("So gio lam viec: ");
        hour = sc.nextInt();
    }
    public void salary()
    {
        salary *= hour;
    }
    public void Display()
    {
        super.Display();
    }



    
}
