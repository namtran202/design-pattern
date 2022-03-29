import Structural.Bridge.Circle;
import Structural.Bridge.GreenCircle;
import Structural.Bridge.RedCircle;
import Structural.Bridge.Shape;
import Structural.Decorator.EmployeeComponent;
import Structural.Decorator.EmployeeConcreteComponent;
import Structural.Decorator.Leader;
import Structural.Decorator.Manager;

public class Main {

    public static void main(String[] args) {
//         Singleton
//        LazyInitialization lazyInitialization = LazyInitialization.getInstance();

//         Factory
//        Bank bank =  BankFactory.getBank(BankType.TPBank);
//        System.out.println(bank.getBankName());

//        Builder
//        Person p = new PersonBuilderImpl()
//                .name("Nam")
//                .nickname("Nam Tran")
//                .build();
//        System.out.println(p.toString());

//            Adapter
//        VietnameseTarget vietnameseTarget = new TranslatorAdapter(new EnglishAdaptee());
//        vietnameseTarget.send("Xin chào");

//        Bridge
//        Shape redCircle = new Circle(new RedCircle());
//        redCircle.draw();
//        Shape greenCircle = new Circle(new GreenCircle());
//        greenCircle.draw();


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
