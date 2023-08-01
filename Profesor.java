
public class Profesor extends Docentes{
    double promedioGrupal;

    public Profesor(String nombre, String genero, int edad, double sueldo){
        super(nombre, genero, edad, sueldo);
    }
    public double Evaluar(){
        return promedioGrupal;
    }
}

