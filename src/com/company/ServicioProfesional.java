package com.company;

public class ServicioProfesional extends Empleado {
    private int mesesContrato;

    public ServicioProfesional(String nombre, String puesto, double salario, int mesesContrato) {
        super(nombre, puesto, salario);
        this.mesesContrato = mesesContrato;
    }

    public int getMeses() {
        return mesesContrato;
    }

    public void setMeses(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }
    public String mostrando(){
        String mensaje="";
        for(Documento d : documentos){
            mensaje+=d.getNombre()+"/"+d.getNumero();
        }
        return mensaje;
    }

    public String toString() {
        return "Servicio Profesional \n"
                +" Meses de Contrato:  " + mesesContrato + " Nombre:  " + nombre + " " +
                " Puesto: " + puesto+ " Salario: " + salario + " Documentos: " + mostrando();
    }
}
