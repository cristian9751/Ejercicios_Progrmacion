package UD8_POII.EjerciciosA;

public class Alumno  extends  Persona{
    Alumno(String n, String a, String f, String grupo, int notaMediaq) {
        super(n, a, f);
        this.grupo = grupo;
        this.notaMedia = notaMediaq;
    }
    protected String grupo;
    protected int notaMedia;

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(int notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String toString() {
        return super.toString() + " " + grupo + " " + notaMedia;
     }
}
