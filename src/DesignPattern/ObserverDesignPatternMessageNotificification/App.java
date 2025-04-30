package DesignPattern.ObserverDesignPatternMessageNotificification;

public class App {
    public static void main(String[] args) {
        Youtube youtube = new Youtube();
        EmailNotification emailNotification = new EmailNotification("Alice");
        SMSNotification smsNotification = new SMSNotification("Bob");

        youtube.subscribe(emailNotification);
        youtube.subscribe(smsNotification);

        youtube.uploadVideo("Java tutorial");
    }
}
