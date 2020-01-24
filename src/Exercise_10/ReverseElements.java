package Exercise_10;

import java.util.ArrayList;
import java.util.Objects;

public class ReverseElements {
    // region Properties
    private ArrayList<Character> characterArrayList;
    // end Properties

    // region Constructors
    public ReverseElements() {
    }

    public ReverseElements(ArrayList<Character> characterArrayList) {
        this.characterArrayList = characterArrayList;
    }
    // end Constructors

    // region getter and setter
    public ArrayList<Character> getCharacterArrayList() {
        return characterArrayList;
    }

    public void setCharacterArrayList(ArrayList<Character> characterArrayList) {
        this.characterArrayList = characterArrayList;
    }
    // end getter and setter

    // region equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReverseElements that = (ReverseElements) o;
        return Objects.equals(characterArrayList, that.characterArrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterArrayList);
    }
    // end equals and hashCode

    // region toString
    @Override
    public String toString() {
        return "ReverseElements{" +
                "characterArrayList=" + characterArrayList +
                '}';
    }
    // end toString

    // region methods
    void reversedListElements(ArrayList<Character> arrayList){
        setCharacterArrayList(arrayList);
        Character firstElement;
        Character lastElement;
        int size = getCharacterArrayList().size();

        for (int i = 0; i < size/2-1; i++) {
            firstElement = getCharacterArrayList().get(i);
            lastElement = getCharacterArrayList().get(size-1);
            getCharacterArrayList().set(i,lastElement);
            getCharacterArrayList().set(size-i,firstElement);
        }
    }
    // end methods

}
