public class Decision04 {
    public static void main(String[] args) {

        float puntuacion = 5.6f;

        if (puntuacion >= 9){
            System.out.println("Tienes un Sobresaliente");
        } else if (puntuacion >=7){
            System.out.println("Tienes un Notable");
        } else if (puntuacion >= 5) {
            System.out.println("Tienes un Aprobado");
        } else {
            System.out.println("Estas suspenso");
        }
    }
}
