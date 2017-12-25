package com.ua.LabWork2.threads.bank;

import java.util.Random;

public class Transfer implements Runnable {
    private Bank bank;
    private int from;
    private int max;
    private int transfer_amount;

    Random random = new Random();


    public Transfer(Bank bank, int from, int max_amount) {
        this.bank = bank;
        this.from = from;
        max = max_amount;
        transfer_amount = max_amount;
    }

    @Override
    public void run() {
        synchronized (bank) {
            System.out.println(Thread.currentThread().getName());
            int amount = random.nextInt(this.transfer_amount);
            int toAcount = random.nextInt(bank.getNumberAccounts());
//            if (toAcount != this.from && amount != 0 && this.max > amount) {
            if (toAcount == this.from) {
                System.out.printf("from: %d t0: %d no translation %n", this.from, toAcount);
            } else if (amount == 0) {
                System.out.printf("from: %d t0: %d no translation because amount = 0 %n", this.from, toAcount);
            } else if (this.max < amount) {
                System.out.printf("from: %d t0: %d amount: Insufficient funds. %n", this.from, toAcount);
            } else {
                this.max -= amount;
                bank.transfer(this.from, toAcount, amount);
            }
        }
    }
}

