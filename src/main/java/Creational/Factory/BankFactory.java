package Creational.Factory;

public class BankFactory {
    public static Bank getBank(BankType bankType) {
        switch (bankType){
            case TPBank:
                return new TPBank();
            case TechComBank:
                return new TechComBank();
            default:
                return null;
        }
    }
}
