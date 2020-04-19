package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        byte opt=0;
        Empresa Empresa = new Empresa(JOptionPane.showInputDialog("Ingrese El nombre de la Empresa"));

        do{
            opt= Byte.parseByte(JOptionPane.showInputDialog(Menu()));

            switch (opt){

                case  1:  Empleado contrato = AñadirEmpleado();
                          Empresa.addEmpleado(contrato);break;
                case 2:   String Nombre=JOptionPane.showInputDialog("Ingrese el Nombre del Empleado a despedir");
                          Empresa.quitEmpleado(Nombre);
                          JOptionPane.showMessageDialog(null,"Elminado con Exito de la lista");
                          break;
                case 3:  JOptionPane.showMessageDialog(null,"A continuacion Se Motrar Los Empleados Pertenecientes a: " +
                        ""+Empresa.getNombre());
                         JOptionPane.showMessageDialog(null,Empresa.toString());
                         break;
                case 4:  String SearchName=JOptionPane.showInputDialog("Igrese el nombre del Empleado porfavor");
                            Empleado empl=null;
                            double salario;
                         Empresa.planilla.forEach(obj->{
                             if(obj.getName().equalsIgnoreCase(SearchName)){
                             }

                        });break;
            }

        }while(opt!=7);

    }

    static String Menu(){
        return "Bienvenido a la empresa \n"+
                "Seleccione un opcion\n"+
                    "1. Agregar empleado\n" +
                "2. Despedir empleado\n" +
                "3. Ver lista de empleados\n" +
                "4. calcular sueldos\n" + //un empleado
                "5. Mostrar Totales \n" + //toda la empresa
                "7. Salir";
    }

    public  static Empleado AñadirEmpleado() {
        byte Opt=0;
        Empleado Emp=null;
        String Name = JOptionPane.showInputDialog("Digite el nombre del empleado");
        String WorkStation = JOptionPane.showInputDialog("Digite EL puesto de trabajo del empleado");
        double Salary = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Salario del empleado"));
        Opt = Byte.parseByte(JOptionPane.showInputDialog("Ingreese El Tipo de Empleado a contratar:\n"+"1.Servicio Profesional\n"+"2.Plaza fija"));

        if(Opt == 1){
            int MesesdeContrato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de meses a contratar al Empleado: "));
            Emp = new ServicioProfesional(Name,WorkStation,Salary,MesesdeContrato);

        }else if(Opt==2){
            int ExtensioTelf=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero De Extension Telefonica del Nuevo Empleado "));
            Emp= new PlazaFija(Name,WorkStation,Salary,ExtensioTelf);
        }
        return Emp;
    }

    public double CalcularSalario(String name, ArrayList plan){

        double salario;

        plan.forEach(obj->{
            if (obj..equalsIgnoreCase(name)){

            }
        });



        return 2.0;
    }

}
