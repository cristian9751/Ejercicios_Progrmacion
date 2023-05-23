package UD8_POII.EjerciciosB.Ej3CuentasBanco;

import UD6_OOP.AppBanco.Cuenta;

public class CuentaCorriente {
    protected String titular;
    protected double saldo;
    protected double interesesMensual;
    protected double cuotaMantenimiento;

    protected double costeOperacion;

    public CuentaCorriente(String titular, double saldo) throws  Exception {
        this.setTitular(titular);
        try {
            this.setSaldo(saldo);
        } catch (Exception e) {
            System.out.println("No se ha podido crear la cuenta " + e.getMessage());
            throw e;
        }
        this.interesesMensual = 1;
        this.costeOperacion = 1;
        this.cuotaMantenimiento = 5;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) throws Exception {
        if(saldo <= 0) {
            throw new Exception("El saldo no puede ser menor  o igual que 0");
        } else {
            this.saldo = saldo;

        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getInteresesMensual() {
        return interesesMensual;
    }

    public double getCuotaMantenimiento() {
        return cuotaMantenimiento;
    }

    public double getCosteOperacion() {
        return costeOperacion;
    }

    public boolean retirar(double cantidad) {
        boolean res = true;
        System.out.println("Coste operacion: " + costeOperacion);
        cantidad -= costeOperacion;
        try {
            this.setSaldo(this.saldo - cantidad);
        } catch (Exception e) {
            System.out.println("No hay fondos suficientes");
            res = false;
        }
        return res;
    }

    public boolean ingresar(double cantidad)   {
        boolean res = true;
        System.out.println("Coste operacion: " + costeOperacion);
        cantidad -= costeOperacion;
        try {
            this.setSaldo(this.saldo + cantidad);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
            res = false;
        }
        return res;
    }

    public void actualizarMensualidad() {
        double interes = (this.saldo * interesesMensual) / 100;
        double saldoFinal = (this.saldo + interes) - cuotaMantenimiento;
        try {
            this.setSaldo(saldoFinal);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "----------\n" +
                "Titular: " + titular + "\n" +
                "Tipo de cuenta: " + getClass().getSimpleName() + "\n" +
                "Saldo " + saldo + "\n";
    }
}
