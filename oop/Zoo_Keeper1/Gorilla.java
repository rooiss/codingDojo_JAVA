public class Gorilla extends Mammal{
    public int throwSomething(){
        System.out.println("Gorilla has thrown something!");
        setEnergyLevel(energyLevel - 5);
        return getEnergyLevel();
    }
    public int climb(){
        System.out.println("HES CLIMBING!!");
        setEnergyLevel(energyLevel - 10);
        return getEnergyLevel();
    }
    public int eatBananas(){
        System.out.println("Gorilla is happy bcuz banana");
        setEnergyLevel(energyLevel + 10);
        return getEnergyLevel();
    }
}