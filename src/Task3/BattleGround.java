package Task3;

public class BattleGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(20);
        Warrior warrior = new Warrior("Max");
        warrior.attackEnemy(enemy);
        enemy.attackHero(warrior);

    }
}
