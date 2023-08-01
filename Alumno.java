public class Alumno extends Persona{
    double promedio;
    public Alumno(String nombre, String genero, int edad,double promedio){
        super(nombre, genero, edad);
        this.promedio=promedio;
    }
    public void Promedio(){
        System.out.println("El promedio del alumno es:" + promedio);
    }
    public boolean Excento(double promedio){
        if (promedio>=8.0){
            System.out.println("El alumno esta excento pues su promedio es mayor o igual a 8:");
            return true;
            
        }
        System.out.println("El alumno no esta excento pues su promedio es menor a 8");
        return false;
    }
}