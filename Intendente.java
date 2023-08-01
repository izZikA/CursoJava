
public class Intendente extends Docentes{
    String turno;
    public Intendente(String nombre, String genero, int edad, double sueldo,String turno){
        super(nombre, genero, edad, sueldo);
        this.turno=turno;
    }
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
