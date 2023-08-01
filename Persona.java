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
}

