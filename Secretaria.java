

public class Secretaria extends Docentes{

    public Secretaria(String nombre, String genero, int edad, double sueldo){
        super(nombre, genero, edad, sueldo);
    }
    public void Pagar(){
        System.out.println("El sueldo de la secretaria es; " + sueldo);
        System.out.println("Se paga: "+  + "Al intendente" + );
        System.out.println("Se paga: "+  + "Al Director");
         System.out.println("Se paga: "+  + "Al profesor");
    }
}

