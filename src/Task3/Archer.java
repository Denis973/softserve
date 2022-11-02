package Task3;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " shooting from behind the mountain" + "Attack Power: 20");
        enemy.takeDamage(20);
    }


}
