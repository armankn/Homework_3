package Exercise_8;

import java.util.ArrayList;
import java.util.Objects;

public class Sort {
    // region Properties
    private ArrayList<Integer> arrayList;
    // end Properties

    // region Constructors
    public Sort() {
    }

    public Sort(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }
    // end Constructors

    // region getter and setter
    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }
    // end getter and setter

    // region equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sort sort = (Sort) o;
        return Objects.equals(arrayList, sort.arrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrayList);
    }
    // end equals and hashCode

    // region toString
    @Override
    public String toString() {
        return "Sort{" +
                "arrayList=" + arrayList +
                '}';
    }
    // end toString

    // region methods
    void sortArrayList(ArrayList<Integer> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i+1; j < arrayList.size()-1; j++) {
                if(arrayList.get(j) > arrayList.get(j+1)){
                    int temp = arrayList.get(j);
                    arrayList.set(j,temp);
                    arrayList.set(j+1,arrayList.get(j));
                }
            }
        }
        System.out.println(arrayList);
    }
    // end methods

}
