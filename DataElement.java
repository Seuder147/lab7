import java.util.Map;
import java.util.TreeMap;
public interface DataElement {
    public TreeMap accept(DataElementVisitor visitor);

}
