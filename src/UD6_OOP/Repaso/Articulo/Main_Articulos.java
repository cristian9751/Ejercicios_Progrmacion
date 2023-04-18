package UD6_OOP.Repaso.Articulo;

public class Main_Articulos {
    public static void main(String[] args) {

        Articulo a1 = new Articulo("Articulo 1", 10.0, 5);
        Articulo a2 = new Articulo("Articulo 1", 10.0, 5);
        Articulo a3 = new Articulo("Articulo 1", 10.0, 5);
        System.out.println(a1);
        System.out.println(a1.getPrecio());
        a1.vender(5);
        a1.vender(1);
    }
}
