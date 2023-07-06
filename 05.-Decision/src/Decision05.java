public class Decision05 {
    public static void main(String[] args) {

        int mesElegido = 8;
        String mesString;
        switch (mesElegido) {
            case 1: mesString = "Enero";
            break;
            case 2: mesString = "Febrero";
            break;
            case 3: mesString = "Marzo";
            break;
            case 4: mesString = "Abril";
            break;
            case 5: mesString = "Mayo";
            break;
            case 6: mesString = "Junio";
            break;
            case 7: mesString = "Julio";
            break;
            case 8: mesString = "Agosto";
            break;
            case 9: mesString = "Septiembre";
            break;
            case 10: mesString = "Octubre";
            break;
            case 11: mesString = "Noviembre";
            break;
            case 12: mesString = "Diciembre";
            break;
            default: mesString = "Mes no válido";
            break;
        }

        System.out.println(mesString);
    }
}
