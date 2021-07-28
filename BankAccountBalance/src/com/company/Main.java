package com.company;

public class Main {

    public static void main(String[] args) {

        Account account = new Account();
        AccountOverdrawDemo overdrawDemo = new AccountOverdrawDemo(account);
        Thread t1 = new Thread(overdrawDemo);
        Thread t2 = new Thread(overdrawDemo);

        t1.setName("Manish");
        t2.setName("Palash");

        t1.start();
        t2.start();



    }
}
