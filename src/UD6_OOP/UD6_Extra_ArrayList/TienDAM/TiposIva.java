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

    public boolean setNombre(String nombre) {
        if(nombre.length() < 1) {
            return false;
        } else {
            this.Nombre = nombre;
            return true;
        }
    }

    public int getProcentaje() {
        return Procentaje;
    }

    public boolean setProcentaje(int procentaje) {
        if(procentaje <= 0) {
            return false;
        } else {
            this.Procentaje = procentaje;
            return true;
        }

    }
}
