package employeemanagementsystem;

class FullTimeEmployee extends Employee implements EmployeeOperations {

    FullTimeEmployee(int employeeId, String employeeName, String department, double salary) {
        super(employeeId, employeeName, department, salary);
    }

    @Override
    double calculateSalary() {
        double bonus = getSalary() * 0.10;
        return getSalary() + bonus;
    }

    @Override
    public void updateSalary(double amount) throws InvalidSalaryException {
        if (amount <= 0) {
            throw new InvalidSalaryException("Invalid amount");
        } else {
            addSalary(amount);
            System.out.println("Salary Credited : " + calculateSalary());
        }
    }

    @Override
    public void displaySalary() {

        System.out.println("Salary :" + calculateSalary());
    }
}
