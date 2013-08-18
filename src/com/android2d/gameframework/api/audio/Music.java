package com.android2d.gameframework.api.audio;

/**
 * User: serg
 * Date: 8/18/13
 * Time: 7:22 PM
 */
public interface Music {

    public void play();

    public void stop();

    public void pause();

    public void setLooping(boolean looping);

    public void setVolume(float volume);

    public boolean isPlaying();

    public boolean isStopped();

    public boolean isLooping();

    public void dispose();

}
