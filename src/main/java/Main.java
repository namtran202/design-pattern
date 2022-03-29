import Structural.Bridge.Circle;
import Structural.Bridge.GreenCircle;
import Structural.Bridge.RedCircle;
import Structural.Bridge.Shape;

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
        Shape redCircle = new Circle(new RedCircle());
        redCircle.draw();
        Shape greenCircle = new Circle(new GreenCircle());
        greenCircle.draw();

    }

}
