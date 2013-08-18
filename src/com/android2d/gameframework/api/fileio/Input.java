package com.android2d.gameframework.api.fileio;

import java.util.List;

/**
 * User: serg
 * Date: 8/18/13
 * Time: 1:01 PM
 */
public interface Input {

    public boolean isKeyPressed(int keyCode);

    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public float getAccelX();

    public float getAccelY();

    public float getAccelZ();

    public List<KeyEvent> getKeyEvents();

    public List<TouchEvent> getTouchEvents();

}
