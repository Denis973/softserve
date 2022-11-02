package Task3;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println(name + " shooting from behind the mountain" + "Attack Power: 120");
        enemy.takeDamage(20);
    }

}
