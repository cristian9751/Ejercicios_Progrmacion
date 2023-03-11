package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioE3;

/**
 * @author cristian
 * @project Ejercicios - Unidad6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioB3
 * @created 10/3/23
 */
public class rectangulo {
    //ATRIBUTOS
    private Double x1, y1, x2, y2;

    public Double getX1() {
        return x1;
    }

    public static final Double MIN = 0.0;
    public static final Double MAX = 100.100;

    public rectangulo(Double x1, Double y1, Double x2, Double y2) {
        if((x1 == y1) && (x2 == y2) && comprobarvalores(x1, x2, y1, y2)) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }
    }



    public void setX1(Double x1) {
        if(x1 == this.y1) {
            this.x1 = x1;
        } else {
            System.err.println(x1 + "Debe ser igual a " + this.y1);
        }

    }

    public Double getY1() {
        return y1;
    }

    public void setY1(Double y1) {
        if(y1 == this.x1) {
            this.y1 = y1;
        } else {
            System.err.println(y1 + "Debe ser igaual a " + this.x1);
        }
    }


    public Double getX2() {
        return x2;
    }

    public void setX2(Double x2) {
        if(x2 == this.y2) {
            this.x2 = x2;
        } else {
            System.err.println(x2 + "Debe ser igual a " + this.y2);
        }
    }

    public Double getY2() {
        return y2;
    }

    public void setY2(Double y2) {
        if(y2 == this.x2) {
            this.y2 = y2;
        } else {
            System.err.println(y2 + "Debe ser igual a " + this.x2);
        }
    }



    public rectangulo(Double valor1, Double valor2) {
        this(valor1, valor1, valor2, valor2);
    }

    public String toString() {
        return "x1=" + this.x1 + "\n" +
                "y1=" + this.y1 + "\n" +
                "x2=" + this.x2 + "\n" +
                "y2=" + this.y2;
    }

    public Double perimetro() {
        return this.x1 + this.y1 + this.x2 + this.y2;
    }

    public Double area() {
        return (this.x1 + this.x2) * (this.y1 + this.y2);
    }

    private static boolean comprobarvalores(Double x1, Double x2, Double y1, Double y2) {
        boolean res = false;
        Double[] valores = {x1, x2, y1, y2};
        for(int i = 0; i<valores.length; i++) {
            res = comprobarvalor(valores[i]);
            if(!res) {
                break;
            }
        }
        return res;
    }
    private static boolean comprobarvalor(Double valor) {
        if(valor >= MIN && valor <= MAX) {
            return true;
        } else {
            System.err.println("No puedes introducir " + valor + " debe estar" +
                    "entre " + MIN + " y " + MAX);
            return false;
        }
    }
}
