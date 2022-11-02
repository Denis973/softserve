package Task3;

public class Enemy implements Mortal {
    private int health;

    public boolean isAlive() {
        if (this.health <= 0) {
            return false;
        }
        return true;
    }

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
        if (!isAlive()) {
            health = 0;
            System.out.println("The enemy is destroyed!, Health equals: " + health);
        } else {
            System.out.println("Health enemy: " + health);
        }
    }
}
