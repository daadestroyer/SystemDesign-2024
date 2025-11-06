package DesignPattern.StateDesignPattern.States;

import DesignPattern.StateDesignPattern.MediaPlayer;

public class PauseState implements StateI{
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Resuming music");
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Already paused");
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Stopping from paused");
        player.setState(new StopState());
    }
}
