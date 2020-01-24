package Exercise_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class RemoveElement {
    // region Properties
    private final int THIRD_ELEMENT = 3;
    // end Properties

    // region Constructors
    public RemoveElement() {
    }
    // end Constructors

    // region getter and setter
    public int getTHIRD_ELEMENT() {
        return THIRD_ELEMENT;
    }
    // end getter and setter

    // region equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RemoveElement that = (RemoveElement) o;
        return THIRD_ELEMENT == that.THIRD_ELEMENT;
    }

    @Override
    public int hashCode() {
        return Objects.hash(THIRD_ELEMENT);
    }
    // end equals and hashCode

    // region toString
    @Override
    public String toString() {
        return "RemoveElement{" +
                "THIRD_ELEMENT=" + THIRD_ELEMENT +
                '}';
    }
    // end toString

    // region methods
    void removeThirdElement(ArrayList<Integer> arrayList){
        if(arrayList.size() > 3){
            arrayList.remove(getTHIRD_ELEMENT());
        } else{
            System.out.println("Given ArrayList doesn't contain elements less that 4");
        }
    }

    void iterateByWhileLoop(ArrayList<Integer> arrayList){
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + ", ");
        }
    }
    // end methods

}
