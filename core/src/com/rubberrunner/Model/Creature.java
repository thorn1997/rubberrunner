package com.rubberrunner.Model;

import com.badlogic.gdx.math.Vector2;

public class Creature extends Entity {
    private int movementVelocity;
    private int maxMovementVelocity;

    private float health;
    private float maxHealth;
    private float armor;
    private float maxArmor;

    private DamageType damageType;
    public enum DamageType {
        PHYSIC(0), MAGIC(1);
        public int value;

        DamageType(int value) {this.value = value;}

        public DamageType getDamageTypeByValue(int value) {
            switch (value) {
                case 0:
                    return PHYSIC;
                case 1:
                    return MAGIC;
                default:
                    return null;
            }
        }
    }

    public Creature() {
    }

    public Creature(Vector2 position) {
        super(position);
    }

    public void damage(float damage, DamageType damageType) {
        if(damageType == DamageType.PHYSIC) {
            if(damage / this.getArmor() > 0.1) {
                this.setHealth(this.getHealth() - (damage / this.getArmor()));
            }
        }
        if(damageType == DamageType.MAGIC) {
            if(damage > 0.1) {
                this.setHealth(this.getHealth() - damage);
            }
        }
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public int getMovementVelocity() {
        return movementVelocity;
    }

    public void setMovementVelocity(int movementVelocity) {
        this.movementVelocity = movementVelocity;
    }

    public int getMaxMovementVelocity() {
        return maxMovementVelocity;
    }

    public void setMaxMovementVelocity(int maxMovementVelocity) {
        this.maxMovementVelocity = maxMovementVelocity;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public float getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(float maxHealth) {
        this.maxHealth = maxHealth;
    }

    public float getArmor() {
        return armor;
    }

    public void setArmor(float armor) {
        this.armor = armor;
    }

    public float getMaxArmor() {
        return maxArmor;
    }

    public void setMaxArmor(float maxArmor) {
        this.maxArmor = maxArmor;
    }
}
