import java.util.TreeMap;

public class ElementVisitor implements DataElementVisitor{
    public TreeMap visit (Character character){
        TreeMap<String, Object> treeMap = new TreeMap<String, Object>();

        treeMap.put("Name", character.getName());
        treeMap.put("Race", character.getRace());

        return treeMap;
    }

    public TreeMap visit(CharacterRase characterRace){
        TreeMap<String, Object> treeMap = new TreeMap<String, Object>();

        treeMap.put("Race", characterRace.getName());

        return treeMap;
    }

    public TreeMap visit (Stats stats){
        TreeMap<String, Object> treeMap = new TreeMap<String, Object>();

        treeMap.put("Stats", stats.getStats());

        return treeMap;
    }
}
