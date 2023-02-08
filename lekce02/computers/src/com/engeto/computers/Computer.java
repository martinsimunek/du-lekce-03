package com.engeto.computers;

public class Computer {
    ///region Atributy

    private String model;
    /* Další modifikátory přístupnosti:
     *  * private ... nikdo z venku (z jiných tříd) nesmí k hodnotě
     *      přistupovat
     *  * public ... veřejné
     *  * bez modifikátoru ... veřejné v rámci balíčku
     *  * protected ... přístupné z potomků v rámci dědičnost
     */

    // Princip „zapouzdření“ (encapsulation)

    private double weight;
    private double diagonalOfMonitor; // camelCase
    private boolean isCompanyComputer;

    ///endregion

    //region Konstruktory

    // objekt třídy X ~ instance třídy X

    public Computer(String model, double weight,
                    double diagonalOfMonitor, boolean isCompanyComputer) {
        this.model = model;
        this.weight = weight;
        this.diagonalOfMonitor = diagonalOfMonitor;
        this.isCompanyComputer = isCompanyComputer;
    }
    public Computer(String model, double weight) {
        this(model, weight, 13.3, true);
    }

    public Computer() {
        this("ABC SuperComp", 1.2);
    }
    // Alternativně lze:
    //        this.model = model;
    //        this.weight = weight;
    //        this.diagonalOfMonitor = 13.3;
    //        this.isCompanyComputer = true;




    //endregion

    ///region Přístupové metody
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDiagonalOfMonitor() {
        return diagonalOfMonitor;
    }

    public void setDiagonalOfMonitor(double diagonalOfMonitor) {
        this.diagonalOfMonitor = diagonalOfMonitor;
    }

    public boolean isCompanyComputer() {
        return isCompanyComputer;
    }

    public void setCompanyComputer(boolean companyComputer) {
        isCompanyComputer = companyComputer;
    }

    ///endregion
}
