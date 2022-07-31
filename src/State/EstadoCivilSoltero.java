package State;

public class EstadoCivilSoltero extends EstadoCivil{
    EstadoCivilSoltero(Persona persona){
        super(persona);
    }
    @Override
    public void tieneCitas() {
        System.out.println("Si, cada semana con una persona especial");
    }

    @Override
    public void tieneHijos() {
        System.out.println("Nooooooo. Aún falta mucho para eso");
    }

    @Override
    public void conQuienSale() {
        System.out.println("Con mis amigos! Y uno que otro arrocito en bajo!");
    }

    @Override
    public void setEstadoCivil(Persona persona) {
        this.persona = persona;
    }
}
