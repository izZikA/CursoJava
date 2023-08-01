

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
}

