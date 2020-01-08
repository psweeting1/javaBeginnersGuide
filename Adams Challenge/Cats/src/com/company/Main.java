package com.company;
import com.company.Cats;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cats> myCat = new ArrayList<>();
        myCat.add(new Cats("Ozzy", "Groves", 4, 2,1,"biting", "sleeping"));
        myCat.add(new Cats("Basil", "Sweeting", 4, 2,1,"meowing loudly", "missing the tray"));

        int i;
        int size = myCat.size();

//        for (i = 0; i < size; i++) {
//            System.out.println(myCat.get(i).toString());
//        }

        for (Cats cat: myCat) {
            System.out.println(cat.toString());
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        for (Integer number: numbers) {
            System.out.println(number);
        }
    }
}
