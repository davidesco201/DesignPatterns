package AbstractFactory;

public class Inventario {
    private Bajo bajo;
    private Guitarra guitarra;

    public Inventario(InstrumentoFactory factory){
        this.bajo = factory.agregarBajo();
        this.guitarra = factory.agregarGuitarra();
    }

    public void registrarInventario(){
        this.bajo.describirInstrumento();
        this.guitarra.describirInstrumento();
    }
}
