package de.javadevblog.box2dtutorial.views;

import com.badlogic.gdx.Screen;
import de.javadevblog.box2dtutorial.Box2DTutorial;

public class LoadingScreen implements Screen {

    private Box2DTutorial game;

    public LoadingScreen(Box2DTutorial game){
        this.game = game;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        game.changeScreen(Box2DTutorial.MENU);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
