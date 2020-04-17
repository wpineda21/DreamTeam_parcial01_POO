package com.company;

import java.util.ArrayList;

public abstract class Empleado {
    protected String Name;
    protected String puesto;
    protected ArrayList<Documento> Documents;
    protected double Salary;

    public Empleado(String name, String puesto, double salary) {
        Name = name;
        this.puesto = puesto;
        Salary = salary;
        Documents=new ArrayList<>();
    }

    public void AddDocument(){

    }

    public void RemoveDocument(){

    }

    public String getName() {
        return Name;
    }

    public String getPuesto() {
        return puesto;
    }

    public ArrayList<Documento> getDocuments() {
        return Documents;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
