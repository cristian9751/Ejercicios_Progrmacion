package UD8_POII.EjerciciosB.Ej3CuentasBanco;

import UD6_OOP.AppBanco.Cuenta;

public class Prinipal {
    public static void main(String[] args) {
        CuentaAhorro ahorro1 = null;
        try {
            ahorro1 = new CuentaAhorro("Titular 1", 1);
        } catch (Exception e) {
            e.getMessage();
        }

        ahorro1.ingresar(10);
        ahorro1.ingresar(10);
        ahorro1.ingresar(10);
        ahorro1.ingresar(10);
        System.out.println(ahorro1);
    }

}