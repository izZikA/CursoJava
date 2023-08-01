
public class Profesor extends Docentes{
    double promedioGrupal;

    public Profesor(String nombre, String genero, int edad, double sueldo){
        super(nombre, genero, edad, sueldo);
    }
    public void promedioGrupal(){
        System.out.println("El promedio de las calificaciones de los alumnos es: "+ promedioGrupal);
        
    }
    public double Evaluar(){
        System.out.println("El promedio de su grupo es :");
        return promedioGrupal;
    }

}

