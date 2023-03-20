package UD6_OOP.AppBanco;

/**
 * @author cristian
 * @project Ejercicios_Progrmacion - UD6_OOP.AppBanco
 * @created 20/3/23
 */
public class Cuenta {
    private String Titular;
    private int Saldo;

    public Cuenta(String titular, int saldo) {
        if(comprobar_saldo(saldo)) {
            this.Saldo = saldo;
            this.Titular = titular;
        }
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int saldo) {
        if(comprobar_saldo(saldo)) {
            this.Saldo = saldo;
        }
    }


    public String toString() {
        return this.Titular + "\t" + this.Saldo;
    }

    private static boolean mayorque(int valor, int min) {
        if(valor > min) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean comprobar_saldo(int saldo) {
        if(mayorque(saldo, -100) && mayorque(saldo, 0)) {
            return true;
        } else {
            System.out.println("El saldo debe de ser mayor que 0 y que -100");
            return false;
        }
    }

    public void ingresar(int saldo) {
        this.setSaldo(this.Saldo + saldo);
    }

    public boolean retirar(int saldo) {
        boolean res = false;
        if(comprobar_saldo(saldo)) {
            if(saldo <= this.Saldo) {
                this.Saldo -= saldo;
            } else {
                System.out.println("La cuenta de " + this.Titular
                + " no tiene fondos suficientes");
            }
        }

        return res;
    }

}
