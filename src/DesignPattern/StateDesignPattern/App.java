package DesignPattern.StateDesignPattern;

public class App {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.play(); // Starting the music
        mediaPlayer.pause();
        mediaPlayer.play();
        mediaPlayer.stop();
        mediaPlayer.pause();
        mediaPlayer.stop();
    }
}
