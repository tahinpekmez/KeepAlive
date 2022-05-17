package Survival.VolunteerAndEnemies;

import Survival.CommonMethods;
import Survival.Interfaces.FeaturesOfCharacters;

public class Zombie extends CommonMethods implements FeaturesOfCharacters {

    public Zombie(String charName, int charHealth) {
        super(charName, charHealth);
    }

    @Override
    public int getLocation() {
        return super.getLocation();
    }

    @Override
    protected void setHealth(int health){
        super.setHealth(health);
    }

    @Override
    public void setLocation(int location) {
        super.setLocation(location);
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public int attackPoint() {
        return 7;
    }
}
