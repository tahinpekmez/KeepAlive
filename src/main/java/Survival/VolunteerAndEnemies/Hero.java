package Survival.VolunteerAndEnemies;

import Survival.CommonMethods;
import Survival.Interfaces.FeaturesOfCharacters;

public class Hero extends CommonMethods implements FeaturesOfCharacters {

    private int health;

    public Hero(String charName, int health) {
        super(charName, health);
        this.health = health;
    }

    @Override
    public void setHealth(int health){
        this.health = health;
    }

    public void enemyAttack(CommonMethods enemy) {
        enemy.health(10);
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int attackPoint() {
        return 10;
    }
}
