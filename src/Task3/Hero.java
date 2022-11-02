package Task3;

public class Hero {
    public String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void attackEnemy(){
        System.out.println("The hero attacks the enemy");
    }
}
