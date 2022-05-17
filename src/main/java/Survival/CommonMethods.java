package Survival;

import Survival.Interfaces.FeaturesOfCharacters;

public abstract class CommonMethods extends PropFileReader implements FeaturesOfCharacters {

    protected String name;
    protected int health;
    protected int location;

    public CommonMethods(String charName, int charHealth) {
        setName(charName);
        this.health = charHealth;
    }

    protected void setHealth(int health) {
        this.health = health;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getHealth() {
        return health;
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isAlive() {
        return getHealth() <= 0;
    }

    @Override
    public void health(int decreasingHealth) {
        health -= decreasingHealth;
    }
}
