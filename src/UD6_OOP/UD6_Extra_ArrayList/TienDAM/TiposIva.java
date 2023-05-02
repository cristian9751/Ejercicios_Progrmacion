package UD6_OOP.UD6_Extra_ArrayList.TienDAM;

public enum TiposIva {
    GENERAL("Iva general", 21),
    REDUCIDO("Iva reducido", 10),
    SUPERREDUCIDO("Iva superreducido", 4);
    private String Nombre;
    private int Procentaje;
    TiposIva(String Nombre, int Procentaje)  {
        this.Nombre = Nombre;
        this.Procentaje = Procentaje;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getProcentaje() {
        return Procentaje;
    }

    public void setProcentaje(int procentaje) {
        Procentaje = procentaje;
    }
}
