public class Persona {
    // Atributos de la clase
    private String nombre;
    private String apellidos;
    private String correoElectronico;
    private String direccion;
    private int edad;
    private int numeroDeTelefono;

    /**
     * Generamos los distintos constructores
     */
    // Constructor por defecto
    public Persona() {
        this.nombre = "desconocido";
        this.apellidos = "desconocido";
        this.correoElectronico = "desconocido";
        this.direccion = "desconocido";
        this.edad = 0;
        this.numeroDeTelefono = 0;
    }
    // Constructor con algunos datos
    public Persona(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    // Constructor con todos los datos
    public Persona(String nombre, String apellidos, String correoElectronico, String direccion, int edad, int numeroDeTelefono){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.edad = edad;
        this.numeroDeTelefono = numeroDeTelefono;
    }

    /**
     * Métodos de los que hará uso la clase
     */
    void caminar(){
        System.out.println("Estoy caminando");
    }
    void nacer(){
        System.out.println("Estoy naciendo");
    }
    void hablar(){
        System.out.println("Estoy hablando");
    }
    void morir(){
        System.out.println("Estoy muriendo");
    }
}
