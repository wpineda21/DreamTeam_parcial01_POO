package com.WJPM;

import javax.swing.*;

public class CalculadoraImpuestos {
    private static double totalRenta;
    private static double totalISSS;
    private static double totalAFP;

    private CalculadoraImpuestos(){ }

    public static double calcularPago(Empleado empleado) {
        double Neto=0,Salario= empleado.getSalario();
        if(empleado instanceof ServicioProfesional){
            double renta = (Salario * 0.1);
            totalRenta += renta;
            Neto= (Salario - renta);
        }
        else if(empleado instanceof PlazaFija) {
            double renta1 = 0,Afp = (0.0625 * Salario);
            double Isss = (0.03 * Salario),Restante = (Salario - Afp - Isss);
            if (Restante >= 0.01 && Restante <= 472.00) {
                renta1 = 0;
            } else if (Restante >= 472.01 && Restante <= 895.24) {
                renta1 = (0.1 * (Restante - 472) + 17.67);
            } else if (Restante >= 895.25 && Restante <= 2037.10) {
                renta1 = (0.2 * (Restante - 895.24) + 60);
            } else if (Restante >= 2038.11) {
                renta1 = (0.3 * (Restante - 2038.10) + 288.57);
            }
            totalRenta += renta1;
            totalAFP += Afp;
            totalISSS += Isss;

            Neto= (Restante - renta1);
        }
        return Neto;
    }
    public static void mostrarTotales(){
        JOptionPane.showConfirmDialog(null,"Los impuestos son: \n " +
                "ISSS: $" + totalISSS + "\nAFP: $"+ totalAFP+ "\nRenta: $"+ totalRenta);
    }
}
