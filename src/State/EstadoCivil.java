package State;

public abstract class EstadoCivil {
    Persona persona;
    EstadoCivil(Persona persona){
        this.persona = persona;
    }
    public abstract void tieneCitas();
    public abstract void tieneHijos();
    public abstract void conQuienSale();
    public abstract void setEstadoCivil(Persona persona);
}
