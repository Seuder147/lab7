import java.util.TreeMap;
public interface DataElementVisitor {
    public TreeMap visit (Character character);

    public TreeMap visit(CharacterRase characterRase);

    public TreeMap visit (Stats stats);
}
