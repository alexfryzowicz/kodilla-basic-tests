package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankTestSuite {
    @Test
    public void shouldHaveZeroPayOutTransactions() {
        CashMachine[] bankCashMachines = new CashMachine[2];
        bankCashMachines[0] = new CashMachine(new double[] {});
        bankCashMachines[1] = new CashMachine(new double[] {});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(0, bank.getPayOutQuantity());
    }

    @Test
    public void shouldHaveOnePayOutTransactions() {
        CashMachine[] bankCashMachines = new CashMachine[2];
        bankCashMachines[0] = new CashMachine(new double[] {1});
        bankCashMachines[1] = new CashMachine(new double[] {1, 29.99, -11.99});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(4, bank.getPayOutQuantity());
    }

    @Test
    public void shouldHaveZeroPayInTransactions() {
        CashMachine[] bankCashMachines = new CashMachine[2];
        bankCashMachines[0] = new CashMachine(new double[] {});
        bankCashMachines[1] = new CashMachine(new double[] {-30});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(1, bank.getPayInQuantity());
    }

    @Test
    public void shouldHaveFourPayInTransactions() {
        CashMachine[] bankCashMachines = new CashMachine[2];
        bankCashMachines[0] = new CashMachine(new double[] {15, 200, 30, -100});
        bankCashMachines[1] = new CashMachine(new double[] {-1, 200});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(6, bank.getPayInQuantity());
    }


    @Test
    public void shouldHaveZeroBalance() {
        CashMachine[] bankCashMachines = new CashMachine[2];
        bankCashMachines[0] = new CashMachine(new double[] {-1});
        bankCashMachines[1] = new CashMachine(new double[] {1});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(2.0, bank.getBalanceBank());
    }

    @Test
    public void shouldHave100Balance() {
        CashMachine[] bankCashMachines = new CashMachine[2];
        bankCashMachines[0] = new CashMachine(new double[] {440});
        bankCashMachines[1] = new CashMachine(new double[] {44, 440, 25, -250});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(5.0, bank.getBalanceBank());
    }

    @Test
    public void shouldHave0PayInAverage() {
        CashMachine[] bankCashMachines = new CashMachine[2];
        bankCashMachines[0] = new CashMachine(new double[] {});
        bankCashMachines[1] = new CashMachine(new double[] {});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(0, bank.getPayInAverage());
    }

    @Test
    public void shouldHave0PayOutAverage() {
        CashMachine[] bankCashMachines = new CashMachine[2];
        bankCashMachines[0] = new CashMachine(new double[] {});
        bankCashMachines[1] = new CashMachine(new double[] {});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(0, bank.getPayOutAverage());
    }

    @Test
    public void shouldHavePayInAverage() {
        CashMachine[] bankCashMachines = new CashMachine[2];
        bankCashMachines[0] = new CashMachine(new double[] {10, 20, 40});
        bankCashMachines[1] = new CashMachine(new double[] {-30, 29.99, 99.99});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(1.84, bank.getPayInAverage(), 0.01);
    }

    @Test
    public void shouldHavePayOutAverage() {
        CashMachine[] bankCashMachines = new CashMachine[2];
        bankCashMachines[0] = new CashMachine(new double[] {1, -2, 3});
        bankCashMachines[1] = new CashMachine(new double[] {-3, -2.2, 1.01});
        Bank bank = new Bank(bankCashMachines);
        assertEquals(-2.4, bank.getPayOutAverage(), 0.01);
    }


}