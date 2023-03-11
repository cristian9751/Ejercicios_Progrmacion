package UD3_CondicionalesYBucles.ejbuclesclase;

public class EjD {
    public static void main(String args[]) {
        int suma = 0;
        for(int i = 1; i<= 10; i++) {
            suma += i;
            System.out.print(i);
            if(i != 10)
                System.out.print(" + ");
        }

        System.out.println(" = " + suma);
    }
}
