public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Adrian", "Velasco Carrasco", "Ronda del Carmen, 5, casa 4", "velascoad@gmail.com", 23, 603811292);

        System.out.println(persona1);
        persona1.saludo("Estoy enviando este mensaje por parametro.");
        System.out.println(persona1.obtenerNombreCompleto());

        Persona persona2 = new Persona();

        persona2.setNombre("Andrea");
        persona2.setApellidos("Nuñez Roldan");
        persona2.setDireccion("Avenida Taginaste, 64");
        persona2.setCorreoElectronico("andreanr3111@gmail.com");
        persona2.setEdad(22);
        persona2.setNumeroTelefono(672458987);

        System.out.println(persona2);
    }
}