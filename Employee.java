
class Employee extends Person {
    private int emp_id;
    private int salary;
    public Employee(String name, String dob, int emp_id, int salary) {
        super(name, dob);
        this.emp_id = emp_id;
        this.salary = salary;
    }
    public void displayEmployeeInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Salary: $" + salary);
    }
    public static void main(String[] args) {
        String name = "Abhi";
        String dob = "2004-04-09";
        int emp_id = 12345;
      int salary = 5000;

        Employee employee = new Employee(name, dob, emp_id, salary);
        employee.displayEmployeeInfo();
    }
}