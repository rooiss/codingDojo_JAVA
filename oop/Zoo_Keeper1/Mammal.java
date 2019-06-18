public class Mammal{
    public int energyLevel = 100;
    public void setEnergyLevel(int energyLevel){
        this.energyLevel = energyLevel;
    }
    public int getEnergyLevel(){
        return energyLevel;
    }
    public int displayEnergy(){
        System.out.println("This energy level is " + energyLevel);
        return energyLevel;
    }
}