
public class Profesor extends Docentes{
    double promedioGrupal;

    public Profesor(String nombre, String genero, int edad, double sueldo){
        super(nombre, genero, edad, sueldo);
    }
    public void promedioGrupal(String nombre1,String nombre2,String nombre3,double promedioAlu1,double promedioAlu2, double promedioAlu3){
        System.out.println("Las calificaciones de sus alumnos son:");
        System.out.println(nombre1 +" : " + promedioAlu1);
        System.out.println(nombre2 +" : " + promedioAlu2);
        System.out.println(nombre3 +" : " + promedioAlu3);
    }
    public double Evaluar(double promedioAlu1,double promedioAlu2, double promedioAlu3){
        System.out.println("El promedio de su grupo es :");
        promedioGrupal = (promedioAlu1 + promedioAlu2 + promedioAlu3)/3;
        return promedioGrupal;
    }
    @Override
    public void Clase(){
        System.out.println("El profesor va a dar la clase");
    }
    @Override
    public void irEscuela(){
        System.out.println("El profesor va a la Escuela a dar la clase");
    }
    @Override
    public void Tarea(){
        System.out.println("El profesor deja la tarea para sus alumnos");
    }

}

