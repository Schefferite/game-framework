package com.android2d.gameframework.api.game;

/**
 * User: serg
 * Date: 8/18/13
 * Time: 8:25 PM
 */
public abstract class Screen {

    protected final Game game;

    public Screen(Game game) {
        this.game = game;
    }

    public abstract void update(float deltaTime);

    public abstract void present(float deltaTime);

    public abstract void pause();

    public abstract void resume();

    public abstract void dispose();

}
