package Exercise_9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayListFirst = new ArrayList<>();
        arrayListFirst.add("Germany");
        arrayListFirst.add("USA");
        arrayListFirst.add("Italy");
        arrayListFirst.add("Spain");
        arrayListFirst.add("Armenia");
        arrayListFirst.add("China");
        System.out.println("First Array List:\n" + arrayListFirst);

        ArrayList<String> arrayListSecond = new ArrayList<>();
        arrayListSecond.add("Honduras");
        arrayListSecond.add("Latvia");
        arrayListSecond.add("Estonia");
        arrayListSecond.add("Russian");
        System.out.println("Second Array List:\n" + arrayListSecond);

        CopyInList copyInList = new CopyInList();
        System.out.println("Combined Array List");
        copyInList.copyListInArrayList(arrayListFirst,arrayListSecond);
    }
}
