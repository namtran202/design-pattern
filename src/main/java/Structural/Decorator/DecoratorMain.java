package Structural.Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        System.out.println("NORMAL EMPLOYEE: ");
        EmployeeComponent employee = new EmployeeConcreteComponent("GPCoder");
        employee.showBasicInformation();
        employee.doTask();

        System.out.println("LEADER: ");
        Leader leader =  new Leader(employee);
        leader.showBasicInformation();
        leader.doTask();

        System.out.println("\nTEAM LEADER AND MANAGER: ");
        Manager teamLeaderAndManager = new Manager(leader);
        teamLeaderAndManager.showBasicInformation();
        teamLeaderAndManager.doTask();
    }
}
