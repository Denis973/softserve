package Task3;

public class Enemy {
    public int health;

    public Enemy(int health) {
        this.health = health;
        System.out.println("The enemy is created and his health: " + health);
    }

    public void setHealth(int health) {
        this.health = health;
        System.out.println("Enemy health set: " + health);
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Health enemy: " + health);
        if (health < 0) {
            health = 0;
            System.out.println("The enemy is destroyed!, Health equals: " + health);
        }
    }


}
