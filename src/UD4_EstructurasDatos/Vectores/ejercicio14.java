package UD4_EstructurasDatos.Vectores;

public class ejercicio14 {
    public static void main(String[] args) {
        int[] sec = new int[55];
        int pos = 0;
        for(int i = 1; i<= 10; i++) {
            int num = i;
            while(num > 0) {
                sec[pos] = i;
                System.out.println(sec[pos]);
                pos++;
                num--;
            }

        }
    }

}
