package UD3_CondicionalesYBucles.ejbuclesclase;

public class EjH {
    public static void main(String args[]) {
        int mult = 1;
        for(int i = 1; i<= 10; i++) {
            System.out.print(i);
            if(i != 10)
                System.out.print(" * ");
            mult *= i;
        }

        System.out.println(" = " + mult);
    }
}
