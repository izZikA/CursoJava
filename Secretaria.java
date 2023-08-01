

public class Secretaria extends Docentes{
    

    public Secretaria(String nombre, String genero, int edad, double sueldo){
        super(nombre, genero, edad, sueldo);
    }
    public void Pagar(double sueldoProfesor,double sueldoIntendente, double sueldoDirector){
        System.out.println("El sueldo de la secretaria es; " + sueldo);
        System.out.println("Se paga: "+ sueldoIntendente + " Al intendente");
        System.out.println("Se paga: "+  sueldoDirector + " Al Director");
        System.out.println("Se paga: "+ sueldoProfesor + " Al profesor");
    }
    @Override
    public void Clase(){
        System.out.println("La secretaria se encarga de inscribir a los alumnos a las clases");
    }
    @Override
    public void irEscuela(){
        System.out.println("La Secretaria va a la escuela a trabajar");
    }
    @Override
    public void Tarea(){
        System.out.println("La Secretaria se encarga de ordenar las Tareas de los docentes");
    }
}

