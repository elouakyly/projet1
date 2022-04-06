package superjeu;

public abstract class Being extends SpacialElement implements Comparable {
    private int maxHealth=100;
    protected int health;
    protected double resistance;

    public Being(String name, int x, int y, int maxHealth, int health, double resistance) {
        super(name, x, y);
        this.maxHealth = maxHealth;
        this.health = health;
        this.resistance = resistance;
    }

    public int receiveDammage(int amount){
         this.health-= amount;
         return this.health;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public void setMaxHealth(int maxHealth){
        this.maxHealth = maxHealth;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }

}
