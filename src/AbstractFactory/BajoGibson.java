package AbstractFactory;

public class BajoGibson implements Bajo{
    public int numCuerdas;
    public String tipo;
    public String marca;

    public BajoGibson() {
        this.numCuerdas = 5;
        this.tipo = "activo";
        this.marca = "Gibson";
    }
    @Override
    public void tocarLineaDeBajo() {
        System.out.println("Tumpa tumpa tudum");
    }

    @Override
    public void describirInstrumento() {
        System.out.println("Soy un bajo con "+this.numCuerdas+" cuerdas"+" de tipo "+this.tipo+" de marca "+ this.marca);
    }
}
