package paquete.Principal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import alumnos.entidades.Alumnos;

/**
 *
 * @author Augusto
 */
public class Principal {

    public static void main(String[] args) {

//        En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
//información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String res = "";
        String res2 = "";
        ArrayList<Alumnos> alumno = new ArrayList();

        do {
            Alumnos a = new Alumnos();
            System.out.println("Ingrese un alumno");
            res2 = leer.next();
            System.out.println("Ahora ingrese las 3 notas");
            for (int i = 0; i < 3; i++) {
                System.out.println("ingrese la " + i + "° nota:");
                a.setNotas(leer.nextInt());
            }
            a.setNombre(res2);
            alumno.add(a);

            System.out.println("Quiere ingresar otro alumno ?");
            res = leer.next();
        } while (res.equalsIgnoreCase("Si"));
        Double promedio = 0.0;
        System.out.println("ingrese el nombre a buscar");
        String nombreABuscar = "";
        nombreABuscar = leer.next();
        Iterator<Alumnos> it = alumno.iterator();
        while (it.hasNext()) {
            Alumnos m = new Alumnos();
            m = it.next();
            if (m.getNombre().equalsIgnoreCase(nombreABuscar)) {
                promedio = m.notaFinal();
                break;
            }
        }
        System.out.println("La nota final es: " + promedio);
    }

}
