package inheritance;

public class Main {
    public static void main(String[] args) {

        Employee developer = new Developer(198,"8hrs",56000);
        developer.doWork(developer.getWorkingHours());
        developer.takeSalary(developer.getSalary());
        System.out.println("=======================");
        Developer dev = new Developer(985,"12hrs",100000);
        dev.setBonus(25000);
        dev.takeSalary(dev.getSalary());

        System.out.println("Bonus : " + dev.getBonus());

    }
}
