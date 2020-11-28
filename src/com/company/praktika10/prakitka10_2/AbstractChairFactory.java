package ru.mirea.praktika.prakitka10_2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    MagicanChair createMagicanChair();
    FunctionalChair createFunctionalChair();
}
