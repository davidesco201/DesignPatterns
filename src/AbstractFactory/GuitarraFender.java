package AbstractFactory;

public class GuitarraFender implements Guitarra{
    @Override
    public void tocarSoloDeGuitarra() {
        System.out.println("Bohemian Rapsody");
    }

    @Override
    public void describirInstrumento() {
        System.out.println("Soy una guitarra Fender");
    }
}
