package Exercise_4;

import java.util.List;
import java.util.Objects;

public class RetrieveElement {
    // region Properties
    private int index;
    // end Properties

    // region Constructors
    public RetrieveElement() {
    }

    public RetrieveElement(int index) {
        this.index = index;
    }
    // end Constructors

    // region getter and setter
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    // end getter and setter

    // region equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RetrieveElement that = (RetrieveElement) o;
        return index == that.index;
    }

    @Override
    public int hashCode() {
        return Objects.hash(index);
    }
    // end equals and hashCode

    // region toString
    @Override
    public String toString() {
        return "RetrieveElement{" +
                "index=" + index +
                '}';
    }
    // end toString

    // region methods
    void retrieveSpecifiedElement(List<String> collection, int index) {
        setIndex(index);
        if(getIndex() > collection.size()-1){
            System.out.println("Please provide index < " + collection.size());
        } else {
            String elemenet  = collection.get(getIndex());
            System.out.println(elemenet);
        }
    }
    // end methods
}
