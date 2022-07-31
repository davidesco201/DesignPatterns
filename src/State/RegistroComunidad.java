package State;

public class RegistroComunidad{
    public static void main(String[] args) {
        Persona personaEncuestada = new Persona("Santiago");
        crearRegistro(personaEncuestada, new EstadoCivilSoltero(personaEncuestada));
        personaEncuestada = new Persona("Laura");
        crearRegistro(personaEncuestada, new EstadoCivilCasado(personaEncuestada));
    }
    public static void crearRegistro(Persona persona, EstadoCivil estadoCivil){
        System.out.println("Persona: " + persona.getNombre());
        persona.setEstadoCivil(estadoCivil);
        persona.tieneCitas();
        persona.conQuienSale();
        persona.tieneHijos();
    }
}
