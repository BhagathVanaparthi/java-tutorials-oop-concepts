package encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeId(532);
        employee.setName("Rajesh");
        employee.setDept("IT");
        employee.setSalary(55000);

        System.out.println("Emp Id : " + employee.getEmployeeId() + "\t" + "Name : " + employee.getName() + "\t" + "Dept : " + employee.getDept() + "\t" + "Salary : " + employee.getSalary());
    }
}
