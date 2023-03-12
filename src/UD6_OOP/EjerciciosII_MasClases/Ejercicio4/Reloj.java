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
        if(comprobarms(minuto, segundo) && comprobar24h(hora)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            System.err.println("El reloj debe tener" +
                    "el formato H M S");
        }

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
        if(comprobarms(minuto)) {
            this.minuto = minuto;
        }
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

    private void imprimeHora(int hora, String txt) {
        System.out.println(hora + " : " + this.minuto + " : " + this.segundo + txt);;
    }

    private void dimeHora12() {
        String txt;
        int hora;
        if(this.hora > 12) {
            txt = "pm";
            hora = this.hora -12;
        } else {
            txt = "am";
            hora = this.hora;
        }
        imprimeHora(hora, txt);
    }

    private void dimeHora24() {
        imprimeHora(this.hora, "h");
    }

    public void dimeHora(int formato) {
        if(formato == 12) {
            dimeHora12();
        } else if(formato == 24) {
            dimeHora24();
        }
    }

    private boolean enrango(int numero, int maximo, String txt) {
        if(numero <= maximo && numero >= 0) {
            return true;
        } else {
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



    public void tick(int formato) {
        this.segundo += 1;
        if(!comprobarms(this.segundo)) {
            this.segundo = 0;
            this.minuto += 1;
        }

        if(!comprobarms(this.minuto)) {
            this.minuto = 0;
            this.hora += 1;
        }

        if(!comprobar24h(this.hora)) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }

        dimeHora(formato);
    }
}
