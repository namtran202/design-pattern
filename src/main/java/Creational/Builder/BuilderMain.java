package Creational.Builder;

public class BuilderMain {
    public static void main(String[] args) {
        Person p = new PersonBuilderImpl()
                .name("Nam")
                .nickname("Nam Tran")
                .build();
        System.out.println(p.toString());
    }
}
