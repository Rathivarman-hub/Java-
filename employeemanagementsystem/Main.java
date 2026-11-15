package employeemanagementsystem;

public class Main {

    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee(21, "Rathi", "CSBS", 25000);
        PartTimeEmployee emp2 = new PartTimeEmployee(22, "Ragul", "CSBS", 25000, 8, 800);
        Employee e1 = emp1;
        Employee e2 = emp2;
        e1.displayDetails();
        e2.displayDetails();
        System.out.println(e1.calculateSalary());
        try {
            emp1.updateSalary(200);
            emp1.updateSalary(-10);

        } catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
        emp1.displaySalary();
        System.out.println("------");
        e2.displayDetails();
        System.out.println(e2.calculateSalary());
        try {
            emp2.updateSalary(200);
            emp2.updateSalary(-10);

        } catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
        emp2.displaySalary();
    }
}
