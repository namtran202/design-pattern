package Structural.Decorator;

public class Leader extends EmployeeDecorator {
    public Leader(EmployeeComponent employee) {
        super(employee);
    }

    public void planing() {
        System.out.println(this.employee.getName() + " is planing.");
    }

    public void motivate() {
        System.out.println(this.employee.getName() + " is motivating his members.");
    }

    @Override
    public void doTask() {
        employee.doTask();
        planing();
        motivate();
    }
}
