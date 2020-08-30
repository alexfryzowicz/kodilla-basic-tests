package com.kodilla.bank.homework;

public class CashMachine {
    double[] transactions;

    public CashMachine(double[] transactions) {
        this.transactions = transactions;
    }

    public double getAccountStatus() { //status konta
        double sum = 0;
        for (int i = 0; i < this.getQuantity(); i++) {
            sum += this.transactions[i];
        }
        return sum;
    }

    public int getQuantity() { //pobierz wypłaty
        return transactions.length;
    }

    public int getPayOutQuantity() { //pobierz kwotę wypłaty
        int quantity = 0;
        for (int i = 0; i < this.getQuantity(); i++) {
            if (this.transactions[i] > 0) {
                quantity++;
            }
        }
        return quantity;
    }

    public double getPayInQuantity() { //ilość płatności
        int quantity = 0;
        for (int i = 0; i < this.getQuantity(); i++) {
            if (this.transactions[i] > 0) {
                quantity++;
            }
        }
        return quantity;
    }

    public double getPayOutSum() { //suma wypłat
        double sum = 0;
        for (int i = 0; i < this.getQuantity(); i++) {
            if (this.transactions[i] < 0) {
                sum += this.transactions[i];
            }
        }
        return sum;
    }

    public double getPayInSum() { //suma wpłat
        double sum = 0;
        for (int i = 0; i < this.getQuantity(); i++) {
            if (this.transactions[i] > 0) {
                sum += this.transactions[i];
            }
        }
        return sum;
    }
}