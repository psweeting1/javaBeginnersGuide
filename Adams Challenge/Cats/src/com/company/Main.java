package com.company;
import com.company.Cats;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cats> myCat = new ArrayList<Cats>();
        myCat.add(new Cats("Ozzy", "Groves", 4, 2,1,"Biting", "Sleeping"));
        System.out.println(myCat.get(0).toString());
    }
}
