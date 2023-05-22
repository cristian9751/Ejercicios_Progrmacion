package UD8_POII.EjerciciosB.Ej3CuentasBanco;

import java.util.concurrent.CompletionException;

public class CuentaAhorro extends CuentaCorriente {
    private static final int maxOperaciones = 3;
    private int contOperaciones;

    public CuentaAhorro(String titular, double saldo) throws Exception {
        super(titular, saldo);
        cuotaMantenimiento = 0;
        interesesMensual = 10;
    }


    @Override
    public boolean ingresar(double cantidad)  {
        if(contOperaciones >= maxOperaciones && super.ingresar(cantidad)) {
            contOperaciones++;
        }
    }
}
