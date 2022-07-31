package AbstractFactory;

public class BajoFender implements Bajo{
    public int numCuerdas;
    public String tipo;
    public String marca;

    public BajoFender() {
        this.numCuerdas = 4;
        this.tipo = "pasivo";
        this.marca = "Fender";
    }

    @Override
    public void tocarLineaDeBajo() {
        System.out.println("Tumpa tumpa");
    }

    @Override
    public void describirInstrumento() {
        System.out.println("Soy un bajo con "+this.numCuerdas+" cuerdas"+" de tipo "+this.tipo+" de marca "+ this.marca);
    }
}
