package DesignPattern.StateDesignPattern;

import DesignPattern.StateDesignPattern.States.StateI;
import DesignPattern.StateDesignPattern.States.StopState;

public class MediaPlayer {
    private StateI stateI;

    public MediaPlayer() {
        this.stateI = new StopState();
    }

    public void setState(StateI state) {
        this.stateI = state;
    }
    public void play(){
        stateI.play(this); // playing the media player
    }
    public void pause(){
        stateI.pause(this); // pausing the media player
    }
    public void stop(){
        stateI.stop(this); //  stopping the media player
    }
}
