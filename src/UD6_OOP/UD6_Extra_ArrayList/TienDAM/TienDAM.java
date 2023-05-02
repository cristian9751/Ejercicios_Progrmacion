package UD6_OOP.UD6_Extra_ArrayList.TienDAM;
public class TienDAM {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("Articulo 1", 21.0, TiposIva.GENERAL, 10 );
        System.out.println(articulo1);

        articulo1.aumentarCantidad(10);
        System.out.println(articulo1.getCantidad());
        articulo1.reducirCantidad(10);
        System.out.println(articulo1.getCantidad());
        articulo1.setIva(TiposIva.REDUCIDO);
        System.out.println(articulo1);
    }
}
