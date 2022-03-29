package Structural.Adapter;

public class AdapterMain {
    public static void main(String[] args) {
        VietnameseTarget vietnameseTarget = new TranslatorAdapter(new EnglishAdaptee());
        vietnameseTarget.send("Xin chào");
    }
}
