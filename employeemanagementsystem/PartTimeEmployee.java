package employeemanagementsystem;

class PartTimeEmployee extends Employee implements EmployeeOperations {

    private final int workingHours;
    private double hourlyRate;

    PartTimeEmployee(int employeeId, String employeeName, String department, double salary, int workingHours, double hourlyRate) {
        super(employeeId, employeeName, department, salary);
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
    }

    @Override
    double calculateSalary() {
        return workingHours * hourlyRate;
    }

    @Override
    public void updateSalary(double amount) throws InvalidSalaryException {
        if (amount <= 0) {
            throw new InvalidSalaryException("Invalid Amount");
        } else {
            hourlyRate=amount;
            System.err.println("Salary : " + calculateSalary());
        }
    }

    @Override
    public void displaySalary() {
        System.out.println(calculateSalary());
    }

}
