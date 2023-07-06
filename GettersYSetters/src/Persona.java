public class Persona {
    /**
     * Atributos de la clase
     */
    private String nombre;
    private String apellidos;
    private String direccion;
    private String correoElectronico;
    private int edad;
    private int numeroTelefono;

    /**
     * Constructores de la clase
     */
    public Persona() {
    }
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public Persona(String nombre, String apellidos, String direccion, String correoElectronico, int edad, int numeroTelefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.edad = edad;
        this.numeroTelefono = numeroTelefono;
    }

    /**
     * GETTERS Y SETTERS
     */
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getNumeroTelefono() {
        return numeroTelefono;
    }
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", edad=" + edad +
                ", numeroTelefono=" + numeroTelefono +
                '}';
    }

    /**
     * Metodos de la clase
     */
    public void saludo(String mensaje){
        System.out.println("Hola mi nombre es " + this.nombre + " " + this.apellidos + " y quiero saludarte diciendote " + mensaje);
    }
    public String obtenerNombreCompleto(){
        return this.nombre + " " + this.apellidos;
    }
}
