
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String op = "The collection " + this.name;
        if (this.elements.isEmpty()) {
            op += " is empty.";
        } else if (this.elements.size() == 1) {
            op += " has 1 element:\n" + this.elements.get(0);
        } else {
            op += " has " + this.elements.size() + " elements:\n";
            for (String str : this.elements) {
                if (str.equals(this.elements.get(this.elements.size() - 1))) {
                    op += str;
                } else {
                    op += str + "\n";
                }
            }
        }
        return op;
    }

}
