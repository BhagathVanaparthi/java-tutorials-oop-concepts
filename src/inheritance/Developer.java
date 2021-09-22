package inheritance;

public class Developer extends Employee{
    private double bonus;

    public Developer(int employeeId, String workingHours, double salary) {
        super(employeeId, workingHours, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
