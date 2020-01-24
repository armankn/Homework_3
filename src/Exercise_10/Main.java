package Exercise_10;

import java.util.ArrayList;

public class Main extends ReverseElements {
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>();
        for (char i = 'A' ; i <= 'Z' ; i++) {
            characters.add(i);
        }
        System.out.print(characters);

        ReverseElements reverseElements = new ReverseElements();
        System.out.println(characters);
        reverseElements.reversedListElements(characters);
    }
}
