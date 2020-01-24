package Exercise_9;

import java.util.ArrayList;
import java.util.Objects;

public class CopyInList {
    // region Properties
    private ArrayList<String> arrayListFirst;
    private ArrayList<String> arrayListSecond;
    // end Properties

    // region Constructors
    public CopyInList() {
    }

    public CopyInList(ArrayList<String> arrayListFirst, ArrayList<String> arrayListSecond) {
        this.arrayListFirst = arrayListFirst;
        this.arrayListSecond = arrayListSecond;
    }
    // end Constructors

    // region getter and setter
    public ArrayList<String> getArrayListFirst() {
        return arrayListFirst;
    }

    public ArrayList<String> getArrayListSecond() {
        return arrayListSecond;
    }

    public void setArrayListFirst(ArrayList<String> arrayListFirst) {
        this.arrayListFirst = arrayListFirst;
    }

    public void setArrayListSecond(ArrayList<String> arrayListSecond) {
        this.arrayListSecond = arrayListSecond;
    }
    // end getter and setter

    // region equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CopyInList that = (CopyInList) o;
        return Objects.equals(arrayListFirst, that.arrayListFirst) &&
                Objects.equals(arrayListSecond, that.arrayListSecond);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrayListFirst, arrayListSecond);
    }
    // end equals and hashCode

    // region toString
    @Override
    public String toString() {
        return "CopyInList{" +
                "arrayListFirst=" + arrayListFirst +
                ", arrayListSecond=" + arrayListSecond +
                '}';
    }
    // end toString

    // region methods
    void copyListInArrayList(ArrayList<String> arrayListFirst, ArrayList<String> arrayListSecond){
        setArrayListFirst(arrayListFirst);
        setArrayListSecond(arrayListSecond);
        arrayListFirst.addAll(arrayListFirst.size(), arrayListSecond);
        System.out.println(arrayListFirst);
    }
    // end methods

}
