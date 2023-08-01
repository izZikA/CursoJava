
public class Director extends Docentes{

public Director(String nombre, String genero, int edad, double sueldo)
{
    super(nombre, genero, edad, sueldo);
}

    void Correr(Docentes docente){
        System.out.println("Se ha de decidido correr a: "+ docente);
    }
}
