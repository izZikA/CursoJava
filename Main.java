
public class Main {
    public static void main(String[] args) {
        //Objetos tipo Alumno Se coloca la info para su creacion ademas de mandar a llamar a sus metodos
        Alumno a = new Alumno("Martin","Hombre",25,8.5);
        a.Info();
        a.irEscuela();
        a.Clase();
        a.Tarea();
        a.Promedio();
        a.Excento();
        System.out.println();
        Alumno b = new Alumno("Jose","Hombre",23,7.5);
        b.Info();
        b.irEscuela();
        b.Clase();
        b.Tarea();
        b.Promedio();
        b.Excento();
        System.out.println();
        Alumno c = new Alumno("Maria","Mujer",21,9.2);
        c.Info();
        c.irEscuela();
        c.Clase();
        c.Tarea();
        c.Promedio();
        c.Excento();
        System.out.println();
        // Se crea un objeto de la clase profesor rellenando sus datos ademas de sus metodos
        Profesor d = new Profesor("Martin", "Masculino", 28, 2000);
        d.Info();
        d.irEscuela();
        d.Clase();
        d.Tarea();
        d.promedioGrupal("Martin", "Jose", "Maria", 8.5, 7.5, 9.2);
        d.Evaluar(8.5, 7.5 , 9.2);
        System.out.println();
        //Se crea un objeto de la clase secretaria ademas de mandar a llamar sus metodos para las pruebas
        Secretaria e = new Secretaria("Vety", "Femenino", 35, 1500);
        e.Info();
        e.irEscuela();
        e.Clase();
        e.Tarea();
        e.Pagar(2000, 1000, 3000);
        System.out.println();
        //Se crea un objeto de la clase Intendente ademas de hacer prueba de sus metodos
        Intendente f = new Intendente("Luis", "Hombre", 40, 1000,"Miercoles");
        f.Info();
        f.irEscuela();
        f.Clase();
        f.Tarea();
        f.Turno();
        //Se crea un objeto de la clase Directoe y se prueban sus metodos 
        Director g = new Director("Roberto", "Hombre", 42, 3000);
        g.Info();
        g.irEscuela();;
        g.Clase();
        g.Tarea();
        g.Correr(f);
    }
}
