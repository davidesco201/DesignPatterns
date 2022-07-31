package State;

public class Persona {
    private EstadoCivil estadoCivil;
    private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
        setEstadoCivil(new EstadoCivilSoltero(this));
    }
    public void tieneCitas(){
        this.estadoCivil.tieneCitas();
    };
    public void tieneHijos(){
        this.estadoCivil.tieneHijos();
    };
    public void conQuienSale(){
        this.estadoCivil.conQuienSale();
    };
    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
        this.estadoCivil.setEstadoCivil(this);
    }
    public String getNombre() {
        return nombre;
    }
}
