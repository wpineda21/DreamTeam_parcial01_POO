package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        boolean salir = false;
        int mesesContrato = 0, extension = 0;
        String menu = "Opciones: \n" +
                "1) Agregar Empleado\n" +
                "2) Despedir Empleado\n" +
                "3) Ver lista de empleados\n" +
                "4) Calcular sueldo\n" +
                "5) Mostrar totales\n" +
                "6) Salir";

        String nombre = "";
        String nomEmpresa = "";
        String puesto = "";
        String numero = "";
        double salario = 0;
        Empresa empresa = null;
        Documento documento = null;
        Empleado empleado = null;

        nomEmpresa = JOptionPane.showInputDialog(null, "Empresa");
        empresa = new Empresa(nomEmpresa);

        String opt;
        do {
            opt = JOptionPane.showInputDialog(null, menu);
            switch (opt) {
                case "1":

                    nombre = JOptionPane.showInputDialog(null, "Nombre ");
                    numero = JOptionPane.showInputDialog(null, "Carnet ");

                    String[] opcion = {"Servicio Profesional", "Plaza Fija"};
                    int aux = JOptionPane.showOptionDialog(null, "Tipo de trabajador", "Agregar empleado",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);

                    if (aux == 0) {
                        puesto = JOptionPane.showInputDialog(null, "Puesto de trabajo");
                        salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Salario en dólares "));
                        mesesContrato = Integer.parseInt(JOptionPane.showInputDialog(null, "Meses de contrato"));
                        documento = new Documento(nombre, numero);
                        empleado = new ServicioProfesional(nombre, puesto, salario, mesesContrato);
                        empleado.addDocumento(documento);
                        empresa.addEmpleado(empleado);
                    } else {
                        puesto = JOptionPane.showInputDialog(null, "Puesto de trabajo");
                        salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Salario en dólares"));
                        extension = Integer.parseInt(JOptionPane.showInputDialog(null, "Extensión (Telefono)"));
                        documento = new Documento(nombre, numero);
                        empleado = new PlazaFija(nombre, puesto, salario, extension);
                        empleado.addDocumento(documento);
                        empresa.addEmpleado(empleado);
                    }
                    break;

                case "2":
                    try {
                        nombre = JOptionPane.showInputDialog(null, "Empleado a despedir");
                        empresa.quitEmpleado(nombre);
                        empleado.removeDocumento(nombre);
                    }catch (EmployException e){
                        JOptionPane.showMessageDialog(null,e.getMessage());
                    }
                    break;
                case "3":
                    try {
                        empresa.mostrarEmpleados();
                    }catch(ListException e){
                        JOptionPane.showMessageDialog(null,e.getMessage());
                    }
                    break;
                case "4":
                    try {
                        nombre = JOptionPane.showInputDialog("ingrese el nombre del empleado :");
                        empresa.conocerSalario(nombre);
                    }catch (EmployException e){
                        JOptionPane.showMessageDialog(null,e.getMessage());
                    }
                    break;
                case "5":
                    CalculadoraImpuestos.mostrarTotales();
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "Saliendo !!! ");
                    salir=true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta!");
            }
        } while (salir!=true);
    }
}