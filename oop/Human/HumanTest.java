public class HumanTest {
    public static void main(String[] args) {
        Human firstHuman = new Human();
        System.out.println(firstHuman.strength);
        Human otherHuman = new Human();
        System.out.println(otherHuman.health);
        firstHuman.attack(otherHuman);
        System.out.println(otherHuman.health);
    }
}