package com.rubberrunner.Controller;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.rubberrunner.Model.Creatures.Player;

public class PlayerController {
    Player player;
    SpriteBatch batch;

    public PlayerController() {
        player = new Player();
        batch = new SpriteBatch();
    }

    public void update() {
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            /*if(Gdx.input.isKeyPressed(Input.Keys.CONTROL_LEFT))
                player.getSprite().translateX(-1f);
            else
                player.getSprite().translateX(-10.0f);*/
        }
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            player.setMovementVelocity(1);
            //player.moveRight();
        }
    }

    public void draw() {
        //player.draw();
    }
}