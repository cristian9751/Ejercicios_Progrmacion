package UD3_CondicionalesYBucles.buclesalpha;

public class Ej6 {
    public static void main(String[] args) {
        int suma = 0;
        for(int i = 1; i<= 10; i++) {
            System.out.print(i);
            if(i != 10)
                System.out.print(" + ");
            suma += i;
        }

        System.out.println(" = " + suma);
    }
}
