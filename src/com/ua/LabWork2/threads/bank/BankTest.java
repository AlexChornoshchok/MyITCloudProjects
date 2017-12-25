package com.ua.LabWork2.threads.bank;

public class BankTest {
    public static final int N_ACCOUNTS = 5;
    public static final int INIT_BALANCE = 1000;

    public static void main(String... args) {
        Bank bank = new Bank(N_ACCOUNTS, INIT_BALANCE);
        Transfer transfer = new Transfer(bank, 3, 500);
        Thread[] thread = new Thread[N_ACCOUNTS];
        for (int i = 0; i < N_ACCOUNTS; i++) {
            thread[i] = new Thread(transfer);
            thread[i].setName("Transfer - " + (i+1));
            thread[i].start();
        }
    }
}
