package ru.mirea.praktika.prakitka10_2;

public class ex {
     public static void main(String[] args){
        Client client=new Client();
        ChairFactory chairFactory=new ChairFactory();
        client.setChair(chairFactory.createFunctionalChair());
        client.sit();
        client.setChair(chairFactory.createMagicanChair());
        client.sit();
        client.setChair(chairFactory.createVictorianChair());
        client.sit();
    }
}
