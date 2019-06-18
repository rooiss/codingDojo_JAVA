public class Human{
    public int strength = 3;
    public int stealth = 3;
    public int intelligence = 3;
    public int health = 100;
    public Human(){
    }
    public int attack(Human otherHuman){
        otherHuman.health -= this.strength;
        return otherHuman.health;
    }
    public int steal(Ninja otherHuman){
        otherHuman.health -= this.intelligence;
        return otherHuman.health;
    }
}

