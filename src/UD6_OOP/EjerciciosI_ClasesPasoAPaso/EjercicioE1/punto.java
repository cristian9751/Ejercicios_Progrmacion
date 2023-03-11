package UD6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioE1;
/**
 * @author cristian
 * @project Ejercicios - Unidad6_OOP.EjerciciosI_ClasesPasoAPaso.EjercicioC1
 * @created 10/3/23
 */
public class punto {
    private Double x, y;//ATRIBUTOS

    /**
     * Constructor con dos atributos double
     * @param x Coordenada X del punto
     * @param y Coordenaa Y del punto
     */
    public punto(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    /***
     * Metodo getter
     * @return Devuelve el parametro x del objeto
     */
    public Double getX() {
        return x;
    }

    /***
     * Metodo que modifica el parametro X del objeto
     * @param x Nuevo valor del parametro X
     */
    public void setX(Double x) {
        this.x = x;
    }

    /***
     * Metodo getter
     * @return Devuelve el parametro y del objeto
     */
    public Double getY() {
        return y;
    }

    /***
     * Modifica el parametro y del objeto
     * @param y Nuevo valor del parametro y
     */
    public void setY(Double y) {
        this.y = y;
    }

    /***
     * Metodo tostring del objeto
     * @return Devulve los parametros del objeto en un string
     */
    public String toString() {
        return "Coordenada x: " + x + "\n" +
                "Coordenada y: " + y + "\n";
    }

    public void setXY(Double x, Double y) {
        this.setX(x);
        this.setY(y);
    }

    public void desplaza(Double dx, Double dy) {
        Double x = this.x + dx;
        Double y = this.y + dy;

        this.setXY(x, y);
    }

    public Double distancia(punto p) {
        Double d_cuadrado = (Math.pow(p.getX() - this.x, 2) + Math.pow(p.getY() - this.y, 2));
        return Math.sqrt(d_cuadrado);
    }
}
