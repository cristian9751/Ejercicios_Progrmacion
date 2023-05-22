package UD8_POII.EjerciciosB.Ej3CuentasBanco;

public class CuentaPro extends CuentaCorriente {
    public CuentaPro(String titular, double saldo) {
        super(titular, saldo);
        this.costeOperacion = 0;
        this.interesesMensual = 0;
        this.cuotaMantenimiento = 100;
    }
}
