package com.android2d.gameframework.api.graphics;

/**
 * User: serg
 * Date: 8/18/13
 * Time: 8:15 PM
 */
public interface Pixmap {

    public int getWidth();

    public int getHeight();

    public PixmapFormat getFormat();

    public void dispose();

}
