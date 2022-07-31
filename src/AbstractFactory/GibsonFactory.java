package AbstractFactory;

public class GibsonFactory implements InstrumentoFactory{
    @Override
    public Bajo agregarBajo() {
        return new BajoGibson();
    }

    @Override
    public Guitarra agregarGuitarra() {
        return new GuitarraGisbon();
    }
}
