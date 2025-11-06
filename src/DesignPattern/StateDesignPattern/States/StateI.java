package DesignPattern.StateDesignPattern.States;

import DesignPattern.StateDesignPattern.MediaPlayer;

public interface StateI {
    void play(MediaPlayer mediaPlayer);
    void pause(MediaPlayer mediaPlayer);
    void stop(MediaPlayer mediaPlayer);
}
