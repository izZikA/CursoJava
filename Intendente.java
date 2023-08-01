
public class Intendente extends Docentes{
    public Intendente(String nombre, String genero, int edad, double sueldo){
        super(nombre, genero, edad, sueldo);
    }
    String turno;

    public void Turno(){
        System.out.println("Le toca asear el dia de la semana: "+ turno);
    }
}
