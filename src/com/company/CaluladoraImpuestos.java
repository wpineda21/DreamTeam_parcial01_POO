package com.company;

public  final class CaluladoraImpuestos {
    private double  TotalRenta;
    private double  TotalISS;
    private double  TotalAFP;

    private CaluladoraImpuestos(){
    }

    public double CalcularPagos(Empleado M){
        double total=0;
        double salario= M.getSalary();

        if(M instanceof ServicioProfesional){
            double renta1 = (salario * 0.1);
            TotalRenta += renta1;
            total= (salario - renta1);
        }
        else if(M instanceof PlazaFija) {
            double renta2 = 0;
            double AFP = (0.0625 * salario);
            double ISS = (0.03 * salario);
            double restante = (salario - AFP - ISS);

            if (restante >= 0.01 && restante <= 472.00) {
                renta2 = 0;
            } else if (restante >= 472.01 && restante <= 895.24) {
                renta2 = (0.1 * (restante - 472) + 17.67);
            } else if (restante >= 895.25 && restante <= 2037.10) {
                renta2 = (0.2 * (restante - 895.24) + 60);
            } else if (restante >= 2038.11) {
                renta2 = (0.3 * (restante - 2038.10) + 288.57);
            }
            TotalRenta+= renta2;
            TotalAFP += AFP;
            TotalISS += ISS;

            total= (restante - renta2);
        }
        return total;
    }

    public String MostrarTotales(){
        return "hola";
    }


}
