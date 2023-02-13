public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(36);
        persona.setNombre("Raul Cuenca");
        persona.setTelefono("909098767");

        System.out.println("Nombre : " + persona.getNombre());
        System.out.println("Edad   : " + persona.getEdad());
        System.out.println("Teléf  : " + persona.getTelefono());

        }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}