package Creational.Builder;

public interface PersonBuilder {
    PersonBuilder name(String name);

    PersonBuilder nickname(String nickname);

    PersonBuilder username(String username);

    Person build();
}
