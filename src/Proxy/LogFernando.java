package Proxy;

import java.util.ArrayList;

public class LogFernando {
    public static void main(String[] args) {
        Cuenta bancolombia = new Cuenta("12234", 800);
        Cuenta scotiabank = new Cuenta("98765", 600);

        registrarLog(bancolombia, new CuentaBancolombia());
        registrarLog(scotiabank, new CuentaScotiabank());

    }
    public static void registrarLog(Cuenta cuenta, IServicioCuenta servicioCuenta){
        IServicioCuenta cuentaProxy = new ProxyCuenta(servicioCuenta);
        cuentaProxy.mostrarSaldo(cuenta);
        cuentaProxy.depositar(cuenta,300);
        cuentaProxy.retirar(cuenta,100);
        cuentaProxy.mostrarSaldo(cuenta);
    }
}
