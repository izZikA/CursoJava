public class Persona {
    String nombre,genero;
    int edad;

    public Persona(String nombre, String genero, int edad){
        this.nombre=nombre;
        this.genero=genero;
        this.edad=edad;
    }

    public void Clase(){
        System.out.println("La persona va a clase");
    }
    public void irEscuela(){
        System.out.println("La perdona va a la escuela");
    }
    public void Tarea(){
        System.out.println("La persona hace tarea");
    }
    public void Info(){
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su genero es: " + genero);
        System.out.println("Su edad es: " + edad);
    }


}

