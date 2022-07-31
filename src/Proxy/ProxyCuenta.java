package Proxy;

import javax.swing.*;
import java.util.logging.Logger;

public class ProxyCuenta implements IServicioCuenta{
    private IServicioCuenta cuentaActual;
    private final static Logger LOGGER = Logger.getLogger(ProxyCuenta.class.getName());

    public ProxyCuenta(IServicioCuenta cuenta){
        this.cuentaActual = cuenta;
    }
    @Override
    public Cuenta retirar(Cuenta cuenta, double monto) {
        LOGGER.info("CuentaProxy - Retirar Dinero");
        if(cuentaActual == null){
            cuentaActual = new CuentaBancolombia();
            return cuentaActual.retirar(cuenta, monto);
        }else {
            return cuentaActual.retirar(cuenta, monto);
        }
    }

    @Override
    public Cuenta depositar(Cuenta cuenta, double monto) {
        LOGGER.info("CuentaProxy - Depositar Dinero");
        if(cuentaActual ==  null){
            cuentaActual =  new CuentaBancolombia();
            return cuentaActual.depositar(cuenta, monto);
        }else {
            return cuentaActual.depositar(cuenta, monto);
        }
    }

    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        LOGGER.info("CuentaProxy - Depositar Dinero");
        if(cuentaActual ==  null){
            cuentaActual = new CuentaBancolombia();
            cuentaActual.mostrarSaldo(cuenta);
        }else {
            cuentaActual.mostrarSaldo(cuenta);
        }
    }
}
