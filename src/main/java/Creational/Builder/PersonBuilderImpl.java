package Creational.Builder;

public class PersonBuilderImpl implements PersonBuilder {
    private String name;
    private String nickname;
    private String username;

    @Override
    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PersonBuilder nickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    @Override
    public PersonBuilder username(String username) {
        this.username = username;
        return this;
    }

    @Override
    public Person build() {
        return new Person(name, nickname, username);
    }
}
