
public class Hobgoblin extends CharacterRase {
    public Hobgoblin(){
        this.name = "Hobgoblin";
        this.bonuses = new Stats(0, 0, 2, 1, 0, 0);
    }

    @Override
    public void say() {
        System.out.println("Hi, I'm a Hobgoblin. I like CABBOOMMM!");
    }
}
