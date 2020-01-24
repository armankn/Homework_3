package Exercise_5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfNum = new ArrayList<>();
        listOfNum.add(5);
        listOfNum.add(3);
        listOfNum.add(231);
        listOfNum.add(0);
        System.out.println("List before changes " + listOfNum);

        UpdateElement elemetn = new UpdateElement();
        elemetn.replaceElementInCollection(listOfNum,3,1000);
        System.out.println(listOfNum);
    }
}
