package Creational.Builder;

public class Person {
    private String name;
    private String nickname;
    private String username;

    public Person() {
    }

    public Person(String name, String nickname, String username) {
        this.name = name;
        this.nickname = nickname;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
