package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        byte opt=0;
        Empresa empresa = new Empresa();

        do{
            opt= Byte.parseByte(JOptionPane.showInputDialog(Menu()));

            switch (opt){
                case 1:
                    String Name = JOptionPane.showInputDialog("Digite el nombre del empleado");
                    String WorkStation= JOptionPane.showInputDialog("Digite EL puesto de trabajo del empleado");
                    double Salary= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Salario del empleado"));



                    break;
            }

        }while(opt!=7);

    }

    static String Menu(){
        return "Bienvenido a la empresa \n"+
                "Seleccione un opcion\n"+
                "1. Agregar empleado\n" +
                "2. Despedir empleado\n" +
                "3. Ver lista de empleados\n" +
                "4. calcular sueldos\n" +
                "5. Mostrar Totales \n" +
                "7. Salir";
    }
}
