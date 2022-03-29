package Structural.Adapter;

public class EnglishAdaptee {
    public void receive(String msg) {
        System.out.println("Receiving msg...");
        System.out.println(msg);
    }

}
