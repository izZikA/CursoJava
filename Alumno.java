public class Alumno extends Persona{
    double promedio;
    public Alumno(String nombre, String genero, int edad,double promedio){
        super(nombre, genero, edad);
        this.promedio=promedio;
    }
    public boolean Excento(double promedio){
        if (promedio>=8.0){
            return true;
        }
        return false;
    }
}