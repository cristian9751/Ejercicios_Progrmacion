package UD8_POII.EjerciciosA;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona("Nombre" , "Apellidos", "1/01/2001" );
        Profesor pr1 = new Profesor("Nombre", "Apellidos", "1/01/2001", 12123.0, "Informatica");
        Alumno alu1 = new Alumno("Nombre", "Apellidos", "1/03/2003", "Grupo 1", 7);


        Persona p2 = new Persona("Nombre2", "Apellidos2", "02/02/2002");
        Profesor pr2 = new Profesor("Nombre2", "Apellidos2", "02/02/2002", 205678,
                "Informatica");
        Alumno alu2 = new Alumno("Nombre2", "Apellidos2", "02/02/2002", "Grupo 2", 8);


        Persona p3 = new Persona("Nombre3", "Apellidos3", "03/03/2003");
        Profesor pr3 = new Profesor("Nombre3", "Apellidos3", "03/03/2003", 121212121,
                "Informatica");

        List<Persona> personas = new ArrayList<>();
        personas.add(p1);
        personas.add(pr1);
        personas.add(alu1);
        personas.add(p2);
        personas.add(pr2);
        personas.add(alu2);
        personas.add(p3);
        personas.add(pr3);


        for(Persona persona : personas) {
            System.out.println(persona);
        }


    }
}
