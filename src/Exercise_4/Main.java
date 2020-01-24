package Exercise_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> element =  new ArrayList();
        element.add("Gugush");
        element.add("Gugushyan");
        element.add("23");
        element.add("Armenia");

        RetrieveElement retrieveElement =  new RetrieveElement();
        retrieveElement.retrieveSpecifiedElement(element,3);
    }
}
