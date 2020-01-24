package Exercise_2;

import Exercise_1.Color;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> professionName = new ArrayList<>();
        professionName.add("Programmer");
        professionName.add("Lawyer");
        professionName.add("Engineer");
        professionName.add("Astronomy");
        professionName.add("Natural sciences");

        Profession profession = new Profession();
        profession.iterateByForLoop(professionName);
        System.out.println();
        profession.iterateByWhileLoop(professionName);
    }
}
