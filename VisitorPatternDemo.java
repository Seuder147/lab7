import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VisitorPatternDemo {
    public static void main(String[] args) throws IOException {
        ElementVisitor visitor = new ElementVisitor();
        JSONObject jsonObject = new JSONObject();
        FileWriter file = new FileWriter("output.json");
        List<DataElement> list = new ArrayList<>();

        RaseAbstractFactory raceAbstractFactory = new HobgoblinFactory();
        Character hobgoblin = new Character("Lin", raceAbstractFactory.create());
        hobgoblin.addRaceBonuses();
        hobgoblin.getRace();

        list.add(hobgoblin);
        list.add(hobgoblin.getRace());
        list.add(hobgoblin.getAttributes());

        for (DataElement elem: list){
            jsonObject.putAll(elem.accept(visitor));
        }

        file.write("[");
        file.write(jsonObject.toJSONString());
        list.clear();

        raceAbstractFactory = new HalflingFactory();
        Character halfling = new Character("Bilbo", raceAbstractFactory.create());
        halfling.addRaceBonuses();

        list.add(halfling);
        list.add(halfling.getRace());
        list.add(halfling.getAttributes());

        for (DataElement elem: list){
            jsonObject.putAll(elem.accept(visitor));
        }

        file.write(" , ");
        file.write(jsonObject.toJSONString());
        file.write("]");
        file.close();
}
}