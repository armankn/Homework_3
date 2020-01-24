package Exercise_6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(4);
        listNumbers.add(3);
        listNumbers.add(2);
        listNumbers.add(1);

        RemoveElement removeElement = new RemoveElement();
        System.out.println("Current list");
        removeElement.iterateByWhileLoop(listNumbers);
        removeElement.removeThirdElement(listNumbers);
        System.out.println("\nList after remove third element");
        removeElement.iterateByWhileLoop(listNumbers);
    }
}
