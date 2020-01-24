package Exercise_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class SearchElement {
    // region Properties
    private boolean element;
    // end Properties

    // region Constructors
    public SearchElement() {
    }

    public SearchElement(boolean element) {
        this.element = element;
    }
    // end Constructors

    // region getter and setter

    public boolean isElement() {
        return element;
    }

    public void setElement(boolean element) {
        this.element = element;
    }
    // end getter and setter

    // region equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchElement that = (SearchElement) o;
        return element == that.element;
    }

    @Override
    public int hashCode() {
        return Objects.hash(element);
    }
    // end equals and hashCode

    // region toString

    @Override
    public String toString() {
        return "SearchElement{" +
                "element=" + element +
                '}';
    }
    // end toString

    // region methods
    void findGivenElement(ArrayList<Boolean> collection, boolean searchableElement){
        if(collection.isEmpty()){
            System.out.println("Given list is empty");
        } else {
            System.out.println("Given Array List is \n" + collection);
            int counter = 0;
            setElement(searchableElement);
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()){
                if(iterator.next().equals(isElement())){
                    counter++;
                }
            }
            System.out.println("The List contains " + counter + " <" + isElement() + "> element");
        }
    }
    // end methods

}
