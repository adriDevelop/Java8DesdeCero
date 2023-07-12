import java.util.Random;

public class Main {

    /**
     * Metodo aleatorio
     * ESTE METODO DEVUELVE UN NUMERO ALEATORIO ENTRE 0 Y LENGTH-1
     */
    public static int aleatorio (int tope){
        Random aleatorio = new Random();
        return aleatorio.nextInt(tope-1);
    }
    public static void main(String[] args) {
        /**
         * Estos dos arrays nos permitirán obtener valores aleatorios para inicializar los datos
         */
        String[] nombres = {"Adrian", "Andrea", "Xavier", "Ainhoa", "Daniel"};
        String[] apellidos = {"Velasco", "Carrasco", "Nuñez", "Roldan"};

        /**
         * Creamos nuestro un array de objetos Persona
         */
        Persona[] personas = new Persona[5];

        /**
         * Y ahora lo que haremos será inicializar los valores de la persona
         */
        for(int i = 0 ; i < personas.length; i++){
            // Obtenemos el nombre de una de las posiciones del array de nombres
            String nombre = nombres[aleatorio(nombres.length)];
            // Obtenemos los apellidos de las posiciones del array de apellidos
            String apellido = apellidos[aleatorio(apellidos.length)];
            // Y creamos nuestra persona con los valores
            personas[i] = new Persona(nombre, apellido);
        }

        /**
         * Ahora recorremos el array de personas para imprimirlas por pantalla
         */
        for(Persona p : personas){
            System.out.println(p);
        }
    }
}