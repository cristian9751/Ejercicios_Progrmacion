package UD6_OOP.EjerciciosII_MasClases.Ejercicio4;

/**
 * @author cristian
 * @project Ejercicios_Progrmacion - UD6_OOP.EjerciciosII_MasClases.Ejercicio4
 * @created 11/3/23
 */
public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public Reloj() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;

    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(comprobar24h(hora)) {
            this.hora = hora;
        }

    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if(comprobarms(segundo)) {
            this.segundo = segundo;
        }

    }

    public void setReloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    private String imprimeHora(int hora, int minuto, int segundo, String txt) {
        return hora + " : " + minuto + " : " + segundo + txt;
    }

    public void dimeHora24() {
        System.out.print("Hora en formato de 24h: ");
        imprimeHora(this.hora, this.minuto, this.segundo, "h");
    }

    private boolean enrango(int numero, int maximo, String txt) {
        if(numero <= maximo && numero >= 0) {
            return true;
        } else {
            System.err.println("Debes introducir un valor menor a" + maximo
            + " y mayor que 0 en " + txt);
            return false;
        }
    }

    private boolean comprobarms(int numero) {
        return enrango(numero, 59, "minutos");
    }

    private boolean comprobarms(int numero1, int numero2) {
        if(comprobarms(numero1) && comprobarms(numero2)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean comprobar24h(int hora) {
        return enrango(hora, 23, "hora");
    }

    private boolean comprobar12h(int hora) {
        return enrango(hora, 11, "hora");
    }

    private boolean comprobarh(int hora, int minutos, int segundos, int formato{
        boolean res = false;
        if(comprobarms(minutos, segundos))
    }

}
