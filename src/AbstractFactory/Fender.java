package AbstractFactory;

public class Fender implements Proveedor{
    private Inventario inventario;
    private InstrumentoFactory factory;
    public Fender(){
        this.factory = new FenderFactory();
        this.inventario = new Inventario(this.factory);
    }
    @Override
    public Inventario getInventario() {
        return this.inventario;
    }
}
