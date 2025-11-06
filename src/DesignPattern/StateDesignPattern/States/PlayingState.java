package DesignPattern.StateDesignPattern.States;

import DesignPattern.StateDesignPattern.MediaPlayer;

public class PlayingState implements StateI{
    @Override
    public void play(MediaPlayer mediaPlayer) {
        System.out.println("Already playing music");
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
        System.out.println("Pausing the music");
        mediaPlayer.setState(new PauseState());
    }

    @Override
    public void stop(MediaPlayer mediaPlayer) {
        System.out.println("Stopping the music");
        mediaPlayer.setState(new StopState());
    }
}
