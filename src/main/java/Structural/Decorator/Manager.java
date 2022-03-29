package Structural.Decorator;

public class Manager extends EmployeeDecorator {

    public Manager(EmployeeComponent employee) {
        super(employee);
    }

    public void assignTask() {
        System.out.println(this.employee.getName() + " is assigning tasks.");
    }

    public void createRequirement() {
        System.out.println(this.employee.getName() + " is create requirements.");
    }

    @Override
    public void doTask() {
        employee.doTask();
        createRequirement();
        assignTask();
    }
}
