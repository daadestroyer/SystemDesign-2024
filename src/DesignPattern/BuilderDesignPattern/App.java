package DesignPattern.BuilderDesignPattern;

public class App {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Shubham", "Nigam").phone("12342323").address("Kanpur").build();
        System.out.println(user);
    }
}
