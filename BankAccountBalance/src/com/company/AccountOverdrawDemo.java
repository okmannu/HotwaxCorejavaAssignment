package com.company;

import java.util.Scanner;

public class AccountOverdrawDemo implements Runnable {

    private Account account;

    public AccountOverdrawDemo(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i<=1; i++) {
            try {
                AccountOverdrawSafeDemo(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (account.getBalance() < 0) {
                System.out.println("Account is Overdraw..!");
            }
        }
    }

    private synchronized void AccountOverdrawSafeDemo(int withdrawAccount) throws InterruptedException {
        if (account.getBalance() >= withdrawAccount) {
            System.out.println(Thread.currentThread().getName() + " -> Is Going To Withdraw Amount = " + withdrawAccount);
            Thread.sleep(3000);
            account.withdraw(withdrawAccount);

            System.out.println(Thread.currentThread().getName()+" -> Your Transaction Successful =" + withdrawAccount);
        } else {
            System.out.println("your Current Balance is : " + account.getBalance());
        }
     }
    }

