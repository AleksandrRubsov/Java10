package ru.mirea.praktika.praktika10_1;

public class ex {
    public static void main(String[] args){
        ConcreteFactory factory = new ConcreteFactory();
        factory.createComplex();
        factory.createComplex(5,2);
    }
}
