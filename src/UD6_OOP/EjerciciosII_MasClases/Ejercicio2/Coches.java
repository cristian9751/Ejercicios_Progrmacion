package UD6_OOP.EjerciciosII_MasClases.Ejercicio2;

/**
 * @author cristian
 * @project Ejercicios_Progrmacion - UD6_OOP.EjerciciosII_MasClases.Ejercicio2
 * @created 11/3/23
 */
public class Coches {
    /***
     * Calse enum de tipos que crea tres objetos de tipo Tipo MINI FAMILIAR y UNITARIO
     */
    public  enum Tipo {

        /**
         * Se crean los objetos de tipo Tipo usando el constructor privado
         */
        MINI("Mini"), UTILITARIO("Utilitario"), FAMILIAR("Familiar"),
        DEPORTIVO("Deportivo");

        /***
         * Parametros de la clase Tipo
         */
        private String nombre;

        /**
         * Constructor privado de la clase tipo
         * @param nombre Recibe un parametro tipo string que es el
         *               parametro nombre que recibira el objeto
         */
        private Tipo(String nombre) {
            this.nombre = nombre;
        }

        /**
         * Metodo que obtiene el parametro nombre del objeto
         * @return Parametro nombre del objeto de tipo Tipo
         */
        public String getNombre() {
            return nombre;
        }
    }

    /***
     * Clase enum de ModalidadSeguro
     */
    public   enum ModalidadSeguro {

        /**
         * Se crean objetos de la clase ModalidadSeguro
         */
        TERCEROS("Seguro de terceros"),
        TODO_RIESGO("Seguro a todo riesgo");
        /**
         * Parametros de la clase
         */
        private String nombre;

        /**
         * Constructor privado de la clase
         * @param nombre Recibe un string que pasara a ser el nombre del objeto de tipo ModalidadSeguro
         */
        private ModalidadSeguro(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
    }

    /**
     * Parametros de la clase Coches
     */
    private String modelo;
    private String color;
    private Boolean metalizado;

    private final String matricula;

    private Tipo tipo;
    private ModalidadSeguro Modalidad;

    /**
     * Constructor de la clase coches
     * @param modelo String que define el modelo del objeto
     * @param color String que define el color del objeto
     * @param metalizado Booleano que devuelve verdadero o falso en el parametro
     *                   metalizado del objeto
     * @param matricula  Valor constante de tipo string que define la Matricula
     * @param tipo Objeto de la clase tipo
     * @param modalidad Objeto de la clase ModalidadSeguro
     */
    public Coches(String modelo, String color, Boolean metalizado, String matricula,
                  Tipo tipo, ModalidadSeguro modalidad) {
        this.modelo = modelo;
        this.color = color;
        this.metalizado = metalizado;
        this.matricula = matricula;
        this.tipo = tipo;
        this.Modalidad = modalidad;
    }

    /**
     * Metodo que obtiene el parametro modelo de un objeto tipo Coche
     * @return Devuelve un string  que es el modelo del coche
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo que modifica el parametro Modelo del objeto Coche
     * @param modelo String que define el parametro modelo del objeto Coche
     */

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getMetalizado() {
        return metalizado;
    }

    public void setMetalizado(Boolean metalizado) {
        this.metalizado = metalizado;
    }

    public String getMatricula() {
        return matricula;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public ModalidadSeguro getModalidad() {
        return Modalidad;
    }

    public void setModalidad(ModalidadSeguro modalidad) {
        Modalidad = modalidad;
    }

    @Override
    public String toString() {
        return "Coches{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", metalizado=" + metalizado +
                ", matricula='" + matricula + '\'' +
                ", tipo=" + tipo.nombre +
                ", Modalidad=" + Modalidad.nombre+
                '}';
    }
}
