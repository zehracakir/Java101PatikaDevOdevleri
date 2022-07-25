package MaasHesaplayici;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary - salary * 3 / 100;

        }

    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;

        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int nowYear = 2021;

        if (nowYear - this.hireYear < 10) {
            return salary + salary * 5 / 100;
        } else if (nowYear - this.hireYear > 9 && nowYear - this.hireYear < 20) {
            return salary + salary * 10 / 100;
        } else {
            return salary + salary * 15 / 100;
        }
    }

    @Override
    public String toString() {
        double taxSalary = tax();
        double bonusSalary = this.salary + bonus();
        double raiseSalary = this.salary + raiseSalary();
        double totalSalary = taxSalary + bonusSalary + raiseSalary;

        System.out.println("*************");
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + taxSalary);
        System.out.println("Bonus salary: " + bonusSalary);
        System.out.println("Raise saslary: " + raiseSalary);
        System.out.println("Total salary: " + totalSalary);
        System.out.println("*************");

        return null;
    }

}
