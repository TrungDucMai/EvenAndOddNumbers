package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        EvenNumber t1 = new EvenNumber();
        OddNumber t2 = new OddNumber();
        t1.start();
        t1.sleep(3500);
        t2.start();
        t2.sleep(2000);
    }
}
