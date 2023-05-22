package UD8_POII.EjerciciosB.Ej3CuentasBanco;

import UD6_OOP.AppBanco.Cuenta;

public class Prinipal {
    public static void main(String[] args) {
        CuentaCorriente corriente1 = null;
        boolean valido = true;
        try {
            corriente1 = new CuentaCorriente("Titular 1", 1);
        } catch (Exception e) {
            valido = false;
            System.out.println(e.getMessage());
        }

        if(valido = true) {
            System.out.println("Cuenta creada");
        } else {
            System.out.println("No se ha creado la cuenta");
        }

        try {
            corriente1.ingresar(1);
        } catch (Exception e) {
            valido = false;
            e.getMessage();
        }

        if(valido) {
            System.out.println(corriente1);
        }

        try {
            corriente1.retirar(2);
        } catch(Exception e) {
            e.getMessage();
        }

    }

}