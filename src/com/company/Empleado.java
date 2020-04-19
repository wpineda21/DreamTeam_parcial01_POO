package com.company;

import java.util.ArrayList;
import java.util.List;

abstract class Empleado {
    protected String nombre;
    protected String puesto;
    protected ArrayList<Documento> documentos;
    protected double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        documentos = new ArrayList<Documento>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public List<Documento> getDocumento() {
        return documentos;
    }

    public void addDocumento(Documento d){
        documentos.add(d);
    }

    public void removeDocumento(String d){
        String dFinal=d;
        documentos.removeIf(s-> s.getNombre().equals(dFinal));
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}