public class TiposDatosNumericos {
    public static void main(String[] args) {

        /**
         * TIPOS DE DATOS ENTEROS
         */
        byte b = 28;
        short s = 3458;
        int i = 33456;
        long l = 3_000_000_000L;

        /**
         * TIPOS DE DATOS REALES
         */
        // Precision simple
        float f = 0.25f;
        // Precision doble
        double Pi = Math.PI;

        /**
         * OPERADORES NUMERICOS
         */
        int x = 7;
        int y = 5;

        // Suma
        int z = x + y;
        System.out.println("Suma " + z);

        // Resta
        z = x - y;
        System.out.println("Resta " + z);

        // Multiplicacion
        z = x * y;
        System.out.println("Multiplicacion " + z);

        // Division(entera)
        z = x/y;
        System.out.println("Division entera " + z);

        // Division(no entera)
        double j = Pi/f;
        System.out.println("Division no entera " + j);

        // Obtener el resto de la división
        z = x%y;
        System.out.println("El resto de la division es " + z);

        // Incremento de valor
        z = ++x;
        System.out.println("Incrementado " + z);


    }
}
