package Proxy;

public class Cuenta {
    private String id;
    private double saldo;

    public Cuenta (String id, double saldo){
        this.id = id;
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
