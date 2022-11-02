package Task3;

public class Mage extends Hero {

    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " gave the potion to drink" + "Attack Power: 30");
        enemy.takeDamage(30);
    }


}
