package DesignPattern.ObserverDesignPatternMessageNotificification;

public class EmailNotification implements NotificationObserver {
    private String name;

    public EmailNotification(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " new video published on " + message);
    }
}
