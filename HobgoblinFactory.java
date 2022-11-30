public class HobgoblinFactory implements RaseAbstractFactory{
    @Override
    public CharacterRase create() {
        return new Hobgoblin();
    }
}
