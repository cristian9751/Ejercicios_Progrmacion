package UD6_OOP.EjerciciosII_MasClases.Ejercicio5;

/**
 * @author cristian
 * @project Ejercicios_Progrmacion - UD6_OOP.EjerciciosII_MasClases.Ejercicio5
 * @created 12/3/23
 */
public class Dni {
    int dni;
    private static final char[] letras_dni = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
    'F', 'P', 'D', 'X', 'B', 'N', 'J','Z','S','Q','V','H','L','C','K','E'};

    public Dni(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return calc_letra();
    }

    private char calc_letra() {
        return letras_dni[this.dni % 23];
    }

    public String getNIF() {
        String res = Integer.toString(this.dni) + calc_letra();
        return res;
    }
}
