package UD6_OOP.EjerciciosII_MasClases.Ejercicios3;

/**
 * @author cristian
 * @project Ejercicios_Progrmacion - UD6_OOP.EjerciciosII_MasClases.Ejercicios3
 * @created 11/3/23
 */
public class CuentaCorriente {
    private int n_cuenta;
    private Double saldo;

    public CuentaCorriente(int n_cuenta, Double saldo) {
        this.n_cuenta = n_cuenta;
        this.saldo = saldo;
    }

    public int getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(int n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    private boolean comprobarnum(Double num) {
        if(num < 0) {
            System.err.println("No se pueden usar cantidades negativas");
            return false;
        } else {
            return true;
        }
    }

    public void ingresar(Double cantidad) {
        if(comprobarnum(cantidad)) {
            this.saldo += (cantidad);
        }

    }

    public boolean retirar(Double cantidad) {
        boolean res = false;
        if(comprobarnum(cantidad)) {
            if(cantidad >= this.saldo) {
                this.saldo -= cantidad;
                res = true;
            } else {
                System.err.println("La cuenta " + this.n_cuenta + "" +
                        "no tiene fondos suficientes");
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "n_cuenta=" + n_cuenta +
                ", saldo=" + saldo +
                '}';
    }
}
