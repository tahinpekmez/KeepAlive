package Survival;

import Survival.Interfaces.FeaturesOfCharacters;
import Survival.VolunteerAndEnemies.Bug;
import Survival.VolunteerAndEnemies.Hero;
import Survival.VolunteerAndEnemies.Lion;
import Survival.VolunteerAndEnemies.Zombie;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MakeCharacter {

    PropFileReader propFileReader = new PropFileReader();

    enum Characters {
        Bug,
        Lion,
        Zombie;

        public static Characters generateRandomCharacter() {
            Characters[] values = Characters.values();
            int length = values.length;
            int randIndex = new Random().nextInt(length);
            return values[randIndex];
        }

    }

    public FeaturesOfCharacters selectCharacter() {

        switch (Characters.generateRandomCharacter()) {
            case Bug:
                return new Hero("Bug", 50);

            case Lion:
                return new Lion("Lion", 100);

            case Zombie:
                return new Zombie("Zombie", 300);
        }

        return null;

    }


}