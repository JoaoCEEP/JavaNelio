package entities;

public class employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(double grossSalary) {
        grossSalary = this.grossSalary - tax;
        return grossSalary;
    }

    public void incressSalary(double percentage) {
        grossSalary +=  grossSalary * (percentage / 100);
    }

    public String toString() {
        return "Employee: " + name + ", $ " + String.format("%.2f" ,netSalary(grossSalary));
    }
}
