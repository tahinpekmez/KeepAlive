package Survival.Survivor;

import Survival.CommonMethods;
import Survival.MakeCharacter;
import Survival.PropFileReader;
import Survival.Results;
import Survival.VolunteerAndEnemies.Hero;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Fight {

    public static final int resources = 5000;
    MakeCharacter makeCharacter = new MakeCharacter();
    PropFileReader propFileReader = new PropFileReader();
    Results results = new Results();



    public void getInfo() {
        results.openFile();
        String inputInfo = propFileReader.getProperty("resources") + "\n"
                + propFileReader.getProperty("heroHp") + "\n"
                + propFileReader.getProperty("heroAttack") + "\n"
                + propFileReader.getProperty("bug") + "\n"
                + propFileReader.getProperty("lion") + "\n"
                + propFileReader.getProperty("zombie") + "\n"
                + propFileReader.getProperty("bugHp") + "\n"
                + propFileReader.getProperty("bugAttack") + "\n"
                + propFileReader.getProperty("lionHp") + "\n"
                + propFileReader.getProperty("lionAttack") + "\n"
                + propFileReader.getProperty("zombieHp") + "\n"
                + propFileReader.getProperty("zombieAttack") + "\n";
        results.addRecors(inputInfo);

    }

    public CommonMethods[] randomEnemies() {

        int totalEnemy = (int) (Math.random() * 3);
        CommonMethods[] enemy = new CommonMethods[totalEnemy];

        int[] location = new int[totalEnemy];
        Random generator = new Random();


        IntStream.range(0, enemy.length).forEachOrdered(i -> location[i] = (generator.nextInt(resources)));

        Arrays.sort(location);

        IntStream.range(0, enemy.length).forEachOrdered(i -> {
            enemy[i] = (CommonMethods) makeCharacter.selectCharacter();
            enemy[i].setLocation(location[i]);

        });

        return enemy;
    }

    public void battle(Hero hero, CommonMethods[] commonMethods) {

        results.openFile();
        String inputInfo = propFileReader.getProperty("resources") + "\n"
                + propFileReader.getProperty("heroHp") + "\n"
                + propFileReader.getProperty("heroAttack") + "\n"
                + propFileReader.getProperty("bug") + "\n"
                + propFileReader.getProperty("lion") + "\n"
                + propFileReader.getProperty("zombie") + "\n"
                + propFileReader.getProperty("bugHp") + "\n"
                + propFileReader.getProperty("bugAttack") + "\n"
                + propFileReader.getProperty("lionHp") + "\n"
                + propFileReader.getProperty("lionAttack") + "\n"
                + propFileReader.getProperty("zombieHp") + "\n"
                + propFileReader.getProperty("zombieAttack") + "\n";
        results.addRecors(inputInfo);

        for (CommonMethods enemy : commonMethods) {

            String str2 = (enemy.getName() + " is Character." + " has hp " + enemy.getHealth() + " attack point " +
                    enemy.attackPoint() + " location " + enemy.getLocation() + " meter.\n");
            results.addRecors(str2);
        }


            IntStream.range(0, commonMethods.length).forEachOrdered(i -> {

            boolean survive = true;

            while (survive) {

                if (commonMethods[i].isAlive() || hero.isAlive()) {
                    survive = false;
                    continue;
                }

                hero.enemyAttack(commonMethods[i]);
                hero.setHealth(hero.getHealth() - commonMethods[i].attackPoint());

                if (hero.isAlive()) {

                    String str2 = (hero.getName() + " vs " + commonMethods[i].getName() + " battle and " + hero.getName() +
                            " died" + " at " + commonMethods[i].getLocation() + " meters.");

                    results.addRecors(str2);
                    survive = false;

                } else if (commonMethods[i].isAlive()) {

                    String str3 = (hero.getName() + " vs " + commonMethods[i].getName() + " battle and " + hero.getName() +
                            " won. " + hero.getHealth() + " health left.\n");
                    results.addRecors(str3);
                    survive = false;
                }

            }

        });

        results.closeFile();

    }

    public Hero myHero() {
        //This method creates our hero

        Hero hero = new Hero("myHero", 1000);
        return hero;
    }

}
