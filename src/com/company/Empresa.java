package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Empresa {
    private String nombre;
    public ArrayList<Empleado> planilla;

    public Empresa(String nombre) {
        this.nombre = nombre;
        planilla = new ArrayList<Empleado>();
    }


    public String getNombre() {
        return nombre;
    }

    public void addEmpleado(Empleado empleado){
        planilla.add(empleado);
    }

    public void quitEmpleado(String nombre) {
        Empleado aux1=null;
        for (Empleado emp:planilla ) {
            if (emp.getName().equalsIgnoreCase(nombre))
                aux1=emp;
        }
        if (aux1!=null){
            planilla.remove(aux1);
            JOptionPane.showMessageDialog(null,"Proceso Realizado con Exito");
        }
    }

    @Override
    public String toString() {
        return "Nombre de la Empresa: " + nombre + '\n'+
                "Planilla: \n" + planilla ;
    }
}
