package UD8_POII.EjerciciosB.Ej3CuentasBanco;

public class CuentaCorriente {
    protected String titular;
    protected double saldo;
    protected  static int interesesMensuales = 1; //PROCENTAJE
    protected static int cuotaMantenimiento = 5;

    protected  static int costeOperacion = 1;

    public CuentaCorriente(String titular, double saldo, int interesesMen, int cuotaMant,
                           int costeOp) throws Exception {
        this.titular = titular;
        if(saldo <= 0) {
            throw new Exception("El saldo de la cuenta no puede ser cero o menor que cero");
        } else {
            this.saldo = saldo;
        }
    }


    public boolean ingresar(int cantidad) throws Exception {
        boolean res = false;
        if(cantidad <= 0) {
            throw new Exception("La cantidad a ingresar no puede ser cero o negativo");
        } else {
            this.saldo += cantidad;
            res = true;
        }
        return res;
    }

    public boolean retirar(int cantidad) throws Exception {
        boolean res = false;
        if(cantidad <= 0) {
            throw new Exception("La cantidad a retirar no puede ser cero o negativo")
        }
    }

}
