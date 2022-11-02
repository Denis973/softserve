package Task3;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " runs into battle" + "Attack Power: 10");
        enemy.takeDamage(10);
    }
}
