package AbstractFactory;

public class Gibson implements Proveedor{
    private Inventario inventario;
    private InstrumentoFactory factory;
    public Gibson(){
        this.factory = new GibsonFactory();
        this.inventario = new Inventario(this.factory);
    }
    @Override
    public Inventario getInventario() {
        return this.inventario;
    }
}
