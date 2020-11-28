package ru.mirea.praktika.prakitka10_2;

public class Client {
    private Chair chair;
    void sit(){
        System.out.println("Client sit on "+chair);
    }
    public void setChair(Chair chair){
        this.chair=chair;
    }
}
