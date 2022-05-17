package Survival.Interfaces;

public interface FeaturesOfCharacters {

    String getName();
    void setName(String name);
    int attackPoint();
    boolean isAlive();
    void health(int decreasingHealth);

}
