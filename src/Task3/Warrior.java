package Task3;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println(name + " runs into battle" + "Attack Power: 10");
        enemy.takeDamage(10);
    }
}
