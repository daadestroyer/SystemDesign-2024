package DesignPattern.StateDesignPattern.States;

import DesignPattern.StateDesignPattern.MediaPlayer;

public class StopState implements StateI{
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Starting the music");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Cannot pause. Music is stopped");
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Already stopped ⏹️");
    }
}
