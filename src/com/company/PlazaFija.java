package com.company;

public class PlazaFija extends Empleado {
    private int Extension;

    public PlazaFija(String name, String puesto, double salary, int extension) {
        super(name, puesto, salary);
        Extension = extension;
    }


    public int getExtension() {
        return Extension;
    }

    public void setExtension(int extension) {
        Extension = extension;
    }
}
