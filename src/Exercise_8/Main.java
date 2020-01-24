package Exercise_8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(15);
        arrayList.add(0);
        arrayList.add(4);
        arrayList.add(45);
        arrayList.add(76);
        arrayList.add(7);

        Sort sort = new Sort();
        System.out.println("Array List before sorting\n" + arrayList);
        System.out.println("Sorted Array List");
        sort.sortArrayList(arrayList);
    }
}
