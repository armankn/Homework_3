package Exercise_2;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Profession {
    // region Properties
    private String nameOfProfession;
    // end Properties

    // region Constructors
    public Profession() {
    }

    public Profession(String nameOfProfession) {
        this.nameOfProfession = nameOfProfession;
    }
    // end Constructors

    // region getter and setter
    public String getNameOfProfession() {
        return nameOfProfession;
    }

    public void setNameOfProfession(String nameOfProfession) {
        this.nameOfProfession = nameOfProfession;
    }
    // end getter and setter

    // region equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profession that = (Profession) o;
        return Objects.equals(nameOfProfession, that.nameOfProfession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfProfession);
    }
    // end equals and hashCode

    // region toString
    @Override
    public String toString() {
        return "Profession{" +
                "nameOfProfession='" + nameOfProfession + '\'' +
                '}';
    }
    // end toString

    // region methods
    void iterateByForLoop(List<String> profession){
        for (String name: profession){
            System.out.println(name);
        }
    }

    void iterateByWhileLoop(List<String> name){
        Iterator iterator = name.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    // end methods

}
