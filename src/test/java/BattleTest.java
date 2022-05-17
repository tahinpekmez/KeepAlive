import Survival.CommonMethods;
import Survival.Results;
import Survival.Survivor.Fight;
import Survival.VolunteerAndEnemies.Hero;
import org.junit.Test;

public class BattleTest {

   Fight fight = new Fight();


    @Test
    public void battle(){
        Hero hero = fight.myHero();
        CommonMethods[] enemy = fight.randomEnemies();
        fight.battle(hero, enemy);


    }

}
