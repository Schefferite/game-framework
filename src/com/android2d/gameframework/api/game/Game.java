package com.android2d.gameframework.api.game;

import com.android2d.gameframework.api.audio.Audio;
import com.android2d.gameframework.api.fileio.FileIO;
import com.android2d.gameframework.api.graphics.Graphics;
import com.android2d.gameframework.api.input.Input;

/**
 * User: serg
 * Date: 8/18/13
 * Time: 8:20 PM
 */
public interface Game {

    public Input getInput();

    public FileIO getFileIO();

    public Graphics getGraphics();

    public Audio getAudio();

    public void setScreen(Screen screen);

    public Screen getCurrentScreen();

    public Screen getStartScreen();

}
