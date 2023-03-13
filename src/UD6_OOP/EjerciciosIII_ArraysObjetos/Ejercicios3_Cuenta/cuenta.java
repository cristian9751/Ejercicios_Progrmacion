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

    public void ingresar(Double saldo) {
        this.Saldo += saldo;
    }

    public boolean retirar(Double saldo) {
        if(this.Saldo >= saldo) {
            this.Saldo -= saldo;
            return true;
        } else {
            System.out.println("La cuenta no tiene fondos suficientes");
            return false;
        }
    }

    @Override
    public String toString() {
        return this.Titular + "\t" + this.Saldo;
    }
}
