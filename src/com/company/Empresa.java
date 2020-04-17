package com.company;

import java.util.ArrayList;

public class Empresa {
    private String NombreEmpresa;
    private ArrayList<Empleado> Payroll;

    public Empresa(String nombreEmpresa) {
        NombreEmpresa = nombreEmpresa;
        Payroll= new ArrayList<>();
    }

    public void addEmpleado(Empleado Empleado){
        Payroll.add(Empleado);
    }

    public void QuitEmpleado(String s){

    }

    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public ArrayList<Empleado> getPayroll() {
        return Payroll;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "NombreEmpresa='" + NombreEmpresa + '\'' +
                ", Payroll=" + Payroll +
                '}';
    }
}
