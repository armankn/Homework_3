package Exercise_7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Boolean> arrayList = new ArrayList<>();
        arrayList.add(true);
        arrayList.add(false);
        arrayList.add(true);
        arrayList.add(true);
        arrayList.add(false);
        arrayList.add(true);
        arrayList.add(false);
        arrayList.add(false);

        SearchElement searchElement = new SearchElement();
        searchElement.findGivenElement(arrayList, true);
    }
}
