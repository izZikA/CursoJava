public class Alumno extends Persona{
    double promedio;
    public Alumno(String nombre, String genero, int edad,double promedio){
        super(nombre, genero, edad);
        this.promedio=promedio;
    }
    public void Promedio(){
        System.out.println("El promedio del alumno es:" + promedio);
    }
    public boolean Excento(){
        if (promedio>=8.0){
            System.out.println("El alumno esta excento pues su promedio es mayor o igual a 8");
            return true;
            
        }
        System.out.println("El alumno no esta excento pues su promedio es menor a 8");
        return false;
    }
    @Override
    public void Clase(){
        System.out.println("El Alumno va a tomar clase");
    }
    @Override
    public void irEscuela(){
        System.out.println("El Alumno va  ala escuela a estudiar");
    }
    @Override
    public void Tarea(){
        System.out.println("El Alumno tiene que hacer su tarea");
    }
}