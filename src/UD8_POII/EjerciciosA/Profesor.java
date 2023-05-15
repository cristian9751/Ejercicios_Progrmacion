package UD8_POII.EjerciciosA;

public class Profesor extends Persona {
    Profesor(String n, String a, String f, double salario, String especialidad) {
        super(n, a, f);
        this.salario = salario;
        this.especialidad = especialidad;
    }
    protected double salario;
    protected String especialidad;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String toString(){
        return super.toString() + " " + salario + " " + especialidad;
    }

}
