package UD6_OOP.TienDAM;

public enum TiposIva {
    GENERAL("Iva general", 21),
    REDUCIDO("Iva reducido", 10),
    SUPERREDUCIDO("Iva superreducido", 4);
    private String nombre;
    private int procentaje;

    private TiposIva(String Nombre, int Procentaje) {
        this.nombre = Nombre;
        this.procentaje = Procentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProcentaje() {
        return procentaje;
    }

    public void setProcentaje(int procentaje) {
        this.procentaje = procentaje;
    }
}