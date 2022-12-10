package Task3;

public abstract class Hero {
    private String name;
    private int health;

    public int takeDamage(int damage) {
        System.out.println(health);
        this.health -= damage;
        if (this.health <= 0) {
            this.health = 0;
            System.out.println("The " + name + " is destroyed! Health equals: " + this.health);
            return this.health;
        } else {
            System.out.println("Health: " + name + " " + this.health);
            return this.health;
        }
    }

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public abstract void attackEnemy(Enemy enemy);
}

