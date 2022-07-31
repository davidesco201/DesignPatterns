package AbstractFactory;

public class GuitarraGisbon implements Guitarra{
    @Override
    public void tocarSoloDeGuitarra() {
        System.out.println("Back in Black");
    }

    @Override
    public void describirInstrumento() {
        System.out.println("Soy una guitarra Gibson. Hell yeah!");
    }
}
