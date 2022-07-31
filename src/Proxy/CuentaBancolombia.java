package Proxy;

public class CuentaBancolombia implements IServicioCuenta{

    @Override
    public Cuenta retirar(Cuenta cuenta, double monto) {
        double saldoActual = cuenta.getSaldo() - monto - (monto * 0.5);
        cuenta.setSaldo(saldoActual);
        System.out.println("Saldo: " + cuenta.getSaldo());
        return cuenta;
    }

    @Override
    public Cuenta depositar(Cuenta cuenta, double monto) {
        double saldoActual = cuenta.getSaldo() + monto;
        cuenta.setSaldo(saldoActual);
        System.out.println("Saldo: " + cuenta.getSaldo());
        return cuenta;
    }

    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        System.out.println("Saldo: " + cuenta.getSaldo());
    }
}
