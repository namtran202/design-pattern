package Creational.Factory;

public class FactoryMain {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.TPBank);
        System.out.println(bank.getBankName());
    }
}
