package Task3;

public class TrainingGround {
    public static void main(String[] args) {
        Hero AlexHero = new Hero("Alex");
        AlexHero.attackEnemy();
        Warrior warrior = new Warrior("Max");
        warrior.attackEnemy();
        Mage mage = new Mage("Artem");
        mage.attackEnemy();
        Archer archer = new Archer("Den");
        archer.attackEnemy();
        Enemy enemy = new Enemy(100);
        archer.attackEnemy(enemy);

    }
}
