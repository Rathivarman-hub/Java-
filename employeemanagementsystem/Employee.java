package employeemanagementsystem;

abstract class Employee {

    private final int employeeId;
    private final String employeeName;
    private final String department;
    private double salary;

    Employee(int employeeId, String employeeName, String department, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    protected void addSalary(double amount) {
        salary = salary + amount;
    }

    abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Department : " + department);
        System.out.println("Salary : " + salary);
    }
}
