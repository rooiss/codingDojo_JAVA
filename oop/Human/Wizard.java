public class Wizard extends Human{
    private int intelligence = 8;
    private int health = 50;
    
    public int heal(Wizard otherHuman){
        otherHuman.health += this.health;
        return otherHuman.health;
    }
    public int fireball(Wizard otherHuman){
        otherHuman.health -= this.intelligence;
        return otherHuman.health;
    }
}
