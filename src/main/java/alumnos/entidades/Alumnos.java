
package alumnos.entidades;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Alumnos {
//    atributos, su nombre y una lista de
//tipo Integer con sus 3 notas.
    String nombre;
    ArrayList<Integer> notas;
    Scanner leer;
    public Alumnos() {
       this.notas =  new ArrayList();
       this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    public Double notaFinal(){
        Double sumador=0.0;
        System.out.println("ingrese el nombre del alumno");
        Iterator<Integer> it = notas.iterator();
        while(it.hasNext()){
          Integer m = 0;
          m=it.next();
        sumador=sumador+m;
        }
    
    
    return (sumador/3);
    }
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(Integer notas) {
        this.notas.add(notas);
    }

    public Alumnos(String nombre) {
        this.nombre = nombre;
        this.notas =  new ArrayList();
       this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
}
