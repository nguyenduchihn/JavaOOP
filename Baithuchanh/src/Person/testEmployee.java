package Person;

public class testEmployee {
    public static void main(String[] args) {
        EmployeeParttime ep = new EmployeeParttime();
        ep.xuatvitri();
        ep.EnterData();
        ep.salary();
        ep.DisplayPosition();
        ep.Display();
        EmployeeFulltime ef = new EmployeeFulltime();
        ef.xuatvitri();
        ef.EnterData();
        ef.salary();
        ef.DisplayPosition();
        ef.Display();

    }

    
}
