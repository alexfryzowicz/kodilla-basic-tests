package com.kodilla.bank.homework;

public class Bank {
    CashMachine[] bankCashMachines;

    public Bank(CashMachine[] bankCashMachines){
        this.bankCashMachines = bankCashMachines;
    }

    public double getBalanceBank(){ //całkowity bilans ze wszystkich bankomatów,

        double sum = 0;
        for (int i = 0; i<this.bankCashMachines.length; i++){
            sum += this.bankCashMachines[i].getQuantity();
        }
        return sum;
    }

    public int getPayInQuantity(){ //liczbę transakcji związanych z wypłatą,

        int quantity = 0;
        for (int i = 0; i < this.bankCashMachines.length; i++){
            quantity += this.bankCashMachines[i].getQuantity();
        }
        return quantity;
    }
    public int getPayOutQuantity(){
        int quantity = 0;
        for (int i = 0; i < this.bankCashMachines.length; i++){
            quantity += this.bankCashMachines[i].getQuantity();
        }
        return quantity;
    }
    public double getPayOutAverage() { //średnia wartość wypłaty,

        double sum = 0;
        int quantity = 0;
        for (int i = 0; i < this.bankCashMachines.length; i++) {
            quantity += this.bankCashMachines[i].getPayOutQuantity();
            sum += this.bankCashMachines[i].getPayOutSum();
        }
        if(quantity == 0)
            return 0;
        return sum / quantity;
    }

    public double getPayInAverage() { //średnia wartość wpłaty.

        double sum = 0;
        int quantity = 0;
        for (int i = 0; i < this.bankCashMachines.length; i++) {
            quantity += this.bankCashMachines[i].getPayInQuantity();
            sum += this.bankCashMachines[i].getPayInSum();
        }
        if(quantity == 0)
            return 0;
        return sum / quantity;
    }

    public static void main(String[] args) {
        CashMachine[] bankCashMachines = new CashMachine[3];
        bankCashMachines[0] = new CashMachine(new double[] {999.20, -1259, -88, });
        bankCashMachines[1] = new CashMachine(new double[] {44.31, -44, -15, 4400, });
        bankCashMachines[2] = new CashMachine(new double[] {1000.99, 1259, -444.21, 55.99, -55.44, -2569.55});

        Bank bank = new Bank(bankCashMachines);

        System.out.println("balance Bank: " + bank.getBalanceBank());
        System.out.println("pay out quantity: " + bank.getPayOutQuantity());
        System.out.println("pay in quantity: " + bank.getPayInQuantity());
        System.out.println("pay out average: " + bank.getPayOutAverage());
        System.out.println("pay in average: " + bank.getPayInAverage());

    }
}