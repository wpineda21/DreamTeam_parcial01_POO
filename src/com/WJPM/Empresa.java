package com.WJPM;

import javax.swing.*;
import java.util.ArrayList;

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

    public void quitEmpleado(String nombreEmpleado) throws EmployException{
        Empleado empleado=null;
        boolean var=false;
        String empleadoFinal=nombreEmpleado;
        if(planilla.removeIf(obj-> obj.getNombre().equalsIgnoreCase(empleadoFinal))==true){
                JOptionPane.showMessageDialog(null,"Empleado Despedido con exito");
                var=true;
            }
        if(var!=true){
                throw  new  EmployException("El Empleado a despedir no existe");
            }
    }

    public void mostrarEmpleados() throws ListException{
        for(Empleado aux : planilla){
                JOptionPane.showMessageDialog(null, aux);
            }
        if (planilla.isEmpty()){
                throw new ListException("No Hay Empleados a Mostrar por el momento");
            }
    }

    public void conocerSalario(String nombre) throws EmployException{
        Empleado empleado=null;
        for(Empleado e: planilla){
                if(e.getNombre().equalsIgnoreCase(nombre))
                    empleado = e;
            }
        if (empleado==null){
                throw new  EmployException("No Existe Empleado; por favor Ingrese Otro");
            }
        double Neto= CalculadoraImpuestos.calcularPago(empleado);
        JOptionPane.showConfirmDialog(null,"Pagar a: "+ nombre +" la cantidad de $:"+ Neto);
    }
}
