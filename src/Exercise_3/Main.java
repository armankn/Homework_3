package Exercise_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> universities = new ArrayList<>();
        universities.add("Kembridg");
        universities.add("Stenford");
        universities.add("Slavianski");
        universities.add("EUA");

        AddInCollection addInCollection = new AddInCollection();
        addInCollection.addFromBeginning(universities,"DUA");
        addInCollection.printCollection(universities);
    }
}
