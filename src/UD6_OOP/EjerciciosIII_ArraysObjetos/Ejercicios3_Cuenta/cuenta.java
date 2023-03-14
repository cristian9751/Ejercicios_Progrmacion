package UD6_OOP.EjerciciosIII_ArraysObjetos.Ejercicios3_Cuenta;

/**
 * @author cristian
 * @project Ejercicios_Progrmacion - UD6_OOP.EjerciciosIII_ArraysObjetos.Ejercicios3_Cuenta
 * @created 13/3/23
 */
public class cuenta {
    private Double Saldo;
    private String Titular;

    public cuenta(Double saldo, String titular) {
        this.Saldo = saldo;
        this.Titular = titular;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double saldo) {
        Saldo = saldo;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public void ingresar(Double saldo, boolean cabecera) {
        this.Saldo += saldo;
        mostrar_cabecera(cabecera);
        System.out.println(this);
    }

    public boolean retirar(Double saldo, boolean cabecera) {
        boolean res = false;
        if(this.Saldo >= saldo) {
            this.Saldo -= saldo;
            res = true;
        } else {
            System.out.println("La cuenta de " + this.Titular
            + " no tiene fondos suficientes");
        }
        mostrar_cabecera(cabecera);

        System.out.println(this);
        return res;
    }

    public static String cabecera() {
        return "Titular" + "\t" + "Saldo";
    }

    private static void mostrar_cabecera(boolean cabecera) {
        if(cabecera) {
            System.out.println(cabecera());
        }
    }

    
    public String toString() {
        return this.Titular + "\t" + this.Saldo;
    }
    
}
