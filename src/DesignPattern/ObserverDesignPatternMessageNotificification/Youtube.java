package DesignPattern.ObserverDesignPatternMessageNotificification;

import java.util.ArrayList;
import java.util.List;

public class Youtube implements YoutubeService {

    private List<NotificationObserver> list = new ArrayList<>();


    @Override
    public void subscribe(NotificationObserver observer) {
        list.add(observer);
    }

    @Override
    public void unsubscribe(NotificationObserver observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for (NotificationObserver observer : list) {
            observer.update(message);
        }
    }

    public void uploadVideo(String message) {
        System.out.println("Video uploaded");
        notifyObserver(message);
    }

}