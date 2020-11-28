package ru.mirea.praktika.prakitka10_2;

public class VictorianChair implements Chair {
   private int age;
    public int getAge(){
        return age;
    }
    public VictorianChair( int age){
        this.age=age;
    }

    @Override
    public String toString() {
        return "VictorianChair{" +
                "age=" + age +
                '}';
    }
}
