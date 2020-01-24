package Exercise_5;

import java.util.List;
import java.util.Objects;

public class UpdateElement {
    // region Properties
    private int position;
    private int newElement;
    // end Properties

    // region Constructors
    public UpdateElement() {
    }

    public UpdateElement(int position, int newElement) {
        this.position = position;
        this.newElement = newElement;
    }
    // end Constructors

    // region getter and setter
    public int getPosition() {
        return position;
    }

    public int getNewElement() {
        return newElement;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setNewElement(int newElement) {
        this.newElement = newElement;
    }
    // end getter and setter

    // region equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateElement that = (UpdateElement) o;
        return position == that.position &&
                newElement == that.newElement;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, newElement);
    }
    // end equals and hashCode

    // region toString
    @Override
    public String toString() {
        return "UpdateElement{" +
                "position=" + position +
                ", newElement=" + newElement +
                '}';
    }
    // end toString

    // region methods
    void replaceElementInCollection(List<Integer> colletion, int position, int newElement){
        if(position > colletion.size()-1){
            System.out.println("Please give position < " + colletion.size());
        } else {
            setPosition(position);
            setNewElement(newElement);
            colletion.set(getPosition(),getNewElement());
        }
    }
    // end methods
}
