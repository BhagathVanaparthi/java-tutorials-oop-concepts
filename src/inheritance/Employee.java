package inheritance;

public class Employee {
    private int employeeId;
    private String workingHours;
    private double salary;

    public Employee(int employeeId, String workingHours, double salary) {
        this.employeeId = employeeId;
        this.workingHours = workingHours;
        this.salary = salary;
    }

    public void doWork(String workingHours){
        System.out.println(" working " + workingHours + " per day!" );
    }

    public void takeSalary(double salary){
        System.out.println(" every month " + salary + " credited to my account!");
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
