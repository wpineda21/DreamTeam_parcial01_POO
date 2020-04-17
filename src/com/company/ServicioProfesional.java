package com.company;

public class ServicioProfesional extends Empleado {
    private  int ContractMounths;

    public ServicioProfesional(String name, String puesto, double salary, int contractMounths) {
        super(name, puesto, salary);
        ContractMounths = contractMounths;
    }

    public int getContractMounths() {
        return ContractMounths;
    }

    public void setContractMounths(int contractMounths) {
        ContractMounths = contractMounths;
    }
}
