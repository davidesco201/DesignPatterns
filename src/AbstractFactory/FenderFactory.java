package AbstractFactory;

public class FenderFactory implements InstrumentoFactory{
    @Override
    public Bajo agregarBajo() {
        return new BajoFender();
    }

    @Override
    public Guitarra agregarGuitarra() {
        return new GuitarraFender();
    }
}
