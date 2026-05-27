package rvt.PD_Test;

public class BankAccount {
    double konts;

    public BankAccount(double konts) {
        this.konts = konts;
    }

    public void bankdeposit(double value) {
        konts += value;
    }

    public void bankwithdraw(double value) {
        if(konts - value >= 0) {
            konts -= value;
        } else {
            System.out.println("Nav pietiekami lidzeklu!");
        }
    }
}
