package com.rubberrunner.Misc;


import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assets {
    // Player
    public static final int PLAYER_ANIMATION_DURATION = 1;
    public static TextureAtlas playerAtlas;
    public static TextureRegion playerIdle;
    public static Animation<TextureRegion> playerRunAnimation;
    public static Sprite playerFrame;

    public Assets() {
    }

    public void loadGameplayAssets() {
        playerIdle = playerAtlas.findRegion("playerIdle");
        TextureRegion[] playerIdleRegion = new TextureRegion[0];
        playerIdleRegion[0] = playerIdle;

        TextureRegion[] playerRunFrames = new TextureRegion[2];
        playerRunFrames[0] = playerAtlas.findRegion("playerRun1");
        playerRunFrames[1] = playerAtlas.findRegion("playerRun2");
        playerRunFrames[2] = playerAtlas.findRegion("playerRun3");
        playerRunAnimation = new Animation<TextureRegion>(PLAYER_ANIMATION_DURATION, playerRunFrames);
    }
}