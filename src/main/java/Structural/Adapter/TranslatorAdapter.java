package Structural.Adapter;

public class TranslatorAdapter implements VietnameseTarget {
    private EnglishAdaptee englishAdaptee;

    public TranslatorAdapter(EnglishAdaptee englishAdaptee) {
        this.englishAdaptee = englishAdaptee;
    }

    @Override
    public void send(String msg) {
        System.out.println("Adapter");
        msg = translate(msg);
        englishAdaptee.receive(msg);
    }

    private String translate(String msg) {
        System.out.println("Translating:" + msg);
        msg = "Hello";
        System.out.println("Translated:" + msg);
        return msg;
    }
}
