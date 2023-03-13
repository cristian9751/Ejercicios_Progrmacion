package UD6_OOP.EjerciciosIII_ArraysObjetos.Ejercicio2_Coches;

public class Coche {
    private String modelo;
    private boolean metalizado;
    private String color;
    private int Fabricacion;
    public enum modalidad_seguro{
        TERCEROS("Seguro de terceros"), TODO_RIESGO("Seguro a todo riesgo");
        String nombre;

        private modalidad_seguro(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return this.nombre;
        }
    };
    private final String matricula;
    private modalidad_seguro modalidad;

    

    
    public Coche(String modelo, modalidad_seguro modalidad, boolean metalizado, String color, int fabricacion, String matricula) {
        this.modelo = modelo;
        this.metalizado = metalizado;
        this.color = color;
        Fabricacion = fabricacion;
        this.matricula = matricula;
        this.modalidad = modalidad;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getmodelo() {
        return modelo;
    }
    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }
    public boolean isMetalizado() {
        return metalizado;
    }
    public void setMetalizado(boolean metalizado) {
        this.metalizado = metalizado;
    }
    public int getFabricacion() {
        return Fabricacion;
    }
    public void setFabricacion(int fabricacion) {
        Fabricacion = fabricacion;
    }

    public void setModalidad(modalidad_seguro Modalidad) {
        this.modalidad = Modalidad;
    }

    public modalidad_seguro getModalidad(modalidad_seguro Modalidad) {
        return this.modalidad;
    }

    

    @Override
    public String toString() {
        return "Coche [modelo=" + modelo + ", metalizado=" + metalizado + ", Fabricacion=" + Fabricacion + "]";
    };
    
    

}
