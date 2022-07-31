package Proxy;

public interface IServicioCuenta {
    Cuenta retirar(Cuenta cuenta, double monto);
    Cuenta depositar(Cuenta cuenta, double monto);
    void mostrarSaldo(Cuenta cuenta);
}
