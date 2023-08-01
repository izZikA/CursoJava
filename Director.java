
public class Director extends Docentes{

public Director(String nombre, String genero, int edad, double sueldo)
{
    super(nombre, genero, edad, sueldo);
}

    void Correr(Docentes docente){
        System.out.println("Se ha de decidido correr a: "+ docente);
    }
    @Override
    public void Clase(){
        System.out.println("Al Directo le toca presentarse frente a una clase");
    }
    @Override
    public void irEscuela(){
        System.out.println("El Director va a hacerce cargo la escuela");
    }
    @Override
    public void Tarea(){
        System.out.println("El Director revisa que las tareas de cada docente se cumplan");
    }
}
