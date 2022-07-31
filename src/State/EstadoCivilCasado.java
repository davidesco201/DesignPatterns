package State;

public class EstadoCivilCasado extends EstadoCivil{

    EstadoCivilCasado(Persona persona) {
        super(persona);
    }

    @Override
    public void tieneCitas() {
        System.out.println("Con mi espos@ UwU");
    }

    @Override
    public void tieneHijos() {
        System.out.println("Siii, ya estamos buscando el 3cero");
    }

    @Override
    public void conQuienSale() {
        System.out.println("Con los amig@s");
    }

    @Override
    public void setEstadoCivil(Persona persona) {
        this.persona = persona;
    }
}
