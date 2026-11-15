package employeemanagementsystem;

interface EmployeeOperations {

    void updateSalary(double amount) throws InvalidSalaryException;

    void displaySalary();
}
