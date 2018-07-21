package com.rubberrunner.Model.Creatures;

import com.badlogic.gdx.math.Vector2;
import com.rubberrunner.Model.Creature;

public class Player extends Creature {
    public static float INITIAL_HEALTH = 50;
    public static float INITIAL_ARMOR = 0;

    public Player() {
        super();
        this.setMaxHealth(INITIAL_HEALTH);
        this.setHealth(INITIAL_HEALTH);
        this.setMaxArmor(INITIAL_ARMOR);
        this.setArmor(INITIAL_ARMOR);
        this.setMovementVelocity(0);
        this.setMaxMovementVelocity(3);
        this.setDamageType(DamageType.PHYSIC);
    }

    public Player(Vector2 position) {
        super(position);
    }
}
