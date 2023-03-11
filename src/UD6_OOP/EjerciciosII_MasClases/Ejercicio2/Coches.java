package UD6_OOP.EjerciciosII_MasClases.Ejercicio2;

/**
 * @author cristian
 * @project Ejercicios_Progrmacion - UD6_OOP.EjerciciosII_MasClases.Ejercicio2
 * @created 11/3/23
 */
public class Coches {
    public  enum Tipo {
        MINI("Mini"), UTILITARIO("Utilitario"), FAMILIAR("Familiar"),
        DEPORTIVO("Deportivo");
        private String nombre;

        private Tipo(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
    }

    public   enum ModalidadSeguro {
        TERCEROS("Seguro de terceros"),
        TODO_RIESGO("Seguro a todo riesgo");
        private String nombre;

        private ModalidadSeguro(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
    }

    private String modelo;
    private String color;
    private Boolean metalizado;

    private final String matricula;

    private Tipo tipo;
    private ModalidadSeguro Modalidad;

    public Coches(String modelo, String color, Boolean metalizado, String matricula,
                  Tipo tipo, ModalidadSeguro modalidad) {
        this.modelo = modelo;
        this.color = color;
        this.metalizado = metalizado;
        this.matricula = matricula;
        this.tipo = tipo;
        Modalidad = modalidad;
    }

    public String getModelo() {
        return modelo;
    }

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
