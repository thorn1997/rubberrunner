package com.rubberrunner;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.rubberrunner.Controller.PlayerController;

public class MainGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	PlayerController playerController;
	
	@Override
	public void create () {
		playerController = new PlayerController();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        draw();
        update();
	}

	public void update() {
        playerController.update();
    }

	public void draw() {
        playerController.draw();
    }
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
