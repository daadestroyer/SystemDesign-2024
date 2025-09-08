package DesignPattern.ObserverDesignPatternMessageNotificification;

import java.util.ArrayList;
import java.util.List;

public interface YoutubeService {
    void subscribe(NotificationObserver observer);
    void unsubscribe(NotificationObserver notificationObserver,String name);
    void notifyObserver(String message);
}
