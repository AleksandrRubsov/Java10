package ru.mirea.praktika.prakitka10_2;

public class MagicanChair implements Chair {
    public void doMagic(){
        System.out.println("Magic");
    }

    @Override
    public String toString() {
        return "Magiiiic";
    }
}
