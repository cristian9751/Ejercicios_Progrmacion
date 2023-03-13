package UD6_OOP.EjerciciosIII_ArraysObjetos.Ejercicio1_Asignaturas;

public class main {
    public static void main(String[] args) {
       Asignatura asignaturas[] = new Asignatura[3];
        asignaturas[0] = new Asignatura("primera", "primero", 0);
        asignaturas[1] = new Asignatura("segunda", "segundo", 1);
        asignaturas[2] = new Asignatura("tercera","tercero", 3);

        for (Asignatura asignatura : asignaturas) {
            System.out.println(asignatura);
        }
    }
}
