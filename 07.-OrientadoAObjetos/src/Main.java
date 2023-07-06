public class Main {
    public static void main(String[] args) {
        // Instanciamos una nueva persona
        Persona persona = new Persona();

        // Hacemos uso de los métodos que puede usar esta persona.
        persona.nacer();
        persona.hablar();
        persona.caminar();
        persona.morir();
    }
}