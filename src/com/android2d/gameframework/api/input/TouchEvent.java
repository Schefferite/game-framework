package com.android2d.gameframework.api.input;

/**
 * User: serg
 * Date: 8/18/13
 * Time: 1:19 PM
 *
 * This class specify constants which coding Touch Event type.
 *
 */
public class TouchEvent {

    public static final int TOUCH_DOWN = 0;
    public static final int TOUCH_UP = 1;
    public static final int TOUCH_DRAGGED = 2;

    public int type;
    public int x, y;
    public int pointer;

}
