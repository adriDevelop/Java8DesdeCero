public class Main {
    public static void main(String[] args) {

        /**
         * Concatenar Strings
         */
        String nombre = "Hola mi nombre es ".concat("Adrian");
        String nombre2 = "Mi nombre es " + "Adrian";
        System.out.println(nombre);
        System.out.println(nombre2);

        /**
         * Mayusculas y Minusculas
         */
        String cadena = "En un lugar de la Mancha";
        System.out.println(cadena);
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());

        /**
         * String format
         */
        String nombreSolo = "Adrian";
        String apellidos = "Velasco Carrasco";
        String mensaje = "¿qué tal estás?";

        System.out.println("Hola soy " + nombreSolo + " " + apellidos + ", y quiero saludarte diciendote " + mensaje);

        System.out.printf("Hola soy %s %s, y quiero saludarte diciendote %s %n", nombreSolo, apellidos, mensaje);

        /**
         * Metodos de comparacion
         */
        System.out.println(cadena.endsWith("la Mancha"));
        System.out.println(cadena.startsWith("En un lugar"));
        System.out.println(cadena.contains("lugar"));

    }
}