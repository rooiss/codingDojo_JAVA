public class Bat extends Mammal{
    public int energyLevel = 300;
    public int fly(){
        System.out.println("flapity flap flap");
        setEnergyLevel(getEnergyLevel() - 50);
        return getEnergyLevel();
    }    
    public int eatHumans(){
        System.out.println("NOM NOM HOOMAN");
        setEnergyLevel(getEnergyLevel() - 25);
        return getEnergyLevel();

    }
    public int attackTown(){
        System.out.println("OOOOO GOD THERES A BAT but also...fire");
        setEnergyLevel(getEnergyLevel() - 100);
        return getEnergyLevel();

    }
}