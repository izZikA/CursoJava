
public class Intendente extends Docentes{
    public Intendente(String nombre, String genero, int edad, double sueldo){
        super(nombre, genero, edad, sueldo);
    }
    String turno;

    public void Turno(){
        System.out.println("Le toca asear el dia de la semana: "+ turno);
    }
    @Override
    public void Clase(){
        System.out.println("El Intendente trabaja aunque hay clases");
    }
    @Override
    public void irEscuela(){
        System.out.println("El Intendente va a asear la escuela");
    }
    @Override
    public void Tarea(){
        System.out.println("El Intendente tiene como tarea limpiar");
    }
}
