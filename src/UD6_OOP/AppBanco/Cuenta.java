package UD6_OOP.AppBanco;

public class Cuenta {
    private String Titular;
    private Double Saldo;

    public Cuenta(String titular, Double saldo) {
        this.Titular = titular;
        if(comprobar_saldo(saldo)) {
            this.Saldo = saldo;
        }
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double saldo) {
        if(comprobar_saldo(saldo)) {
            this.Saldo = saldo;
        }
    }

    
    public void ingresar(Double saldo)  {
        if(comprobar_saldo(saldo)) {
            this.Saldo += saldo;
        }
    }

    public void retirar(Double saldo) {
        if(mayorque(saldo, this.Saldo))  {
            this.setSaldo(this.Saldo -= saldo);
        } else {
            System.out.println("La cuenta de " + this.Titular + " no tiene"
            + " fondos suficientes" );
        }
    }


    private boolean mayorque(Double cantidad, Double max) {
        if(cantidad > max) {
            return true;
        } else {
            return false;
        }
    }

    private boolean comprobar_saldo(Double cantidad) {
        if(mayorque(cantidad, -100.0) && mayorque(cantidad, 0.0)) {
            return true;
        } else {
            System.out.println("Debes indicar una cantidad mayor que 0 y que -100");
            return false;
        }
    }
    
}
