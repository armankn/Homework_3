package Exercise_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<>();
        colorList.add("Black");
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Yellow");
        colorList.add("Pink");
        colorList.add("White");

        Color color = new Color();
        color.printCollection(colorList);
    }
}
