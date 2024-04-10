public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasevaluaciones;

    int getTotalDeLasevaluaciones(){
        return totalDeLasevaluaciones;
    }

    void muestraFichaTecnica() {
        System.out.println("El nombre de pelicula es: " + nombre);
        System.out.println("Su fecha es Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Su duracion es de: " + duracionEnMinutos + " minutos");
    }

    void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        //sumaDeLasEvaluaciones = sumaDeLasEvaluaciones + nota;
        totalDeLasevaluaciones++;
    }

    double calculaMedia(){
        return sumaDeLasEvaluaciones/totalDeLasevaluaciones;
    }
}