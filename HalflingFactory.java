public class HalflingFactory implements RaseAbstractFactory{
    @Override
    public CharacterRase create() {
        return new Halfling();
    }
}
