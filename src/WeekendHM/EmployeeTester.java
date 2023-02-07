package WeekendHM;

public class EmployeeTester {
    public static void main(String[] args) {
        FullTime full=new FullTime("John","$90k",3333,"QA Tester","40 hours");
        Employee employee=new Employee("John","$90k",123);
        employee.employee();
        full.info();
    }
}
