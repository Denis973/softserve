package Task3;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println(name + " gave the potion to drink" + "Attack Power: 30");
        enemy.takeDamage(30);
    }
}
