package Survival.VolunteerAndEnemies;

import Survival.CommonMethods;
import Survival.Interfaces.FeaturesOfCharacters;

public class Bug extends CommonMethods implements FeaturesOfCharacters {

    public Bug(String charName, int charHealth) {
        super(charName, charHealth);
    }


    @Override
    protected void setHealth(int health){
        super.setHealth(health);
    }

    @Override
    public int getLocation() {
        return super.getLocation();
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
        return 2;
    }

}
