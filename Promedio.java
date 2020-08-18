public class Promedio {
    public static void main(String args[]) {
        var matematicas = 5;
        var biologia = 8;
        var quimica = 7;
        var promedio = 0;
        promedio = (matematicas + biologia + quimica) / 3;
        if (promedio >= 6) {
            System.out.println("el alumno aproboc con un Promedio de:"+ promedio);
        } else {
            System.out.println("el alumno reprobo ");

        }
    }
}
