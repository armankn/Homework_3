package Exercise_3;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class AddInCollection {
    // region Properties
    private String university;
    // end Properties

    // region Constructors
    public AddInCollection() {
    }

    public AddInCollection(String university) {
        this.university = university;
    }
    // end Constructors

    // region getter and setter
    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    // end getter and setter

    // region equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise_3.AddInCollection that = (Exercise_3.AddInCollection) o;
        return Objects.equals(university, that.university);
    }

    @Override
    public int hashCode() {
        return Objects.hash(university);
    }
    // end equals and hashCode

    // region toString
    @Override
    public String toString() {
        return "AddInCollection{" +
                "university='" + university + '\'' +
                '}';
    }
    // end toString

    // region methods
    void printCollection(List<String> name){
        Iterator iterator = name.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    void addFromBeginning(List<String> collection, String name){
        setUniversity(name);
        collection.add(0,getUniversity());
    }
    // end methods
}

