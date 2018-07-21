package com.rubberrunner.Model;

import com.badlogic.gdx.math.Vector2;

public class Entity {
    private Vector2 position;

    public Entity() {
    }

    public Entity(Vector2 position) {
        this.position = position;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(int x, int y) {
        this.position.x = x;
        this.position.y = y;
    }
}
