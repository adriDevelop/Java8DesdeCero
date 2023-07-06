public class Main {
    public static void main(String[] args) {
        // Creamos distintos objetos persona con los distintos constructores
        Persona persona1 = new Persona();
        Persona persona2 = new  Persona("Adrian", "Velasco Carrasco");
        Persona persona3 = new Persona("Andrea", "Nuñez Roldan", "andreanr3111@gmail.com", "Avenida Taginaste, 64", 22, 672547854);

        persona1.nacer();
        persona1.caminar();
        persona2.caminar();
        persona2.hablar();
        persona3.caminar();
        persona3.morir();

    }
}