package com.company;

public class PlazaFija extends Empleado {
    private int extension;

    public PlazaFija(String nombre, String puesto, double salario, int extension) {
        super(nombre, puesto, salario);
        this.extension = extension;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }
    public String mostrarDocs(){
        String mensaje="";
        for(Documento d : documentos){
            mensaje+=d.getNombre()+"/"+d.getNumero();
        }
        return mensaje;
    }

    public String toString() {
        return "PlazaFija \n" +  " Extension: " + extension +  " Nombre:  " + nombre + " Puesto: " + puesto +
                " Salario: " + salario + " Documentos: " + mostrarDocs();
    }
}
