public class Halfling extends CharacterRase {
    public Halfling() {
        name = "Halfling";
        bonuses = new Stats(0, 2, 1, 0, 0, 0);
    }

    @Override
    public void say() {
        System.out.println("Hi, I'm an Halfling. Want my apple?");
    }
}
