package com.workintech.dependencyproject.tax;

public class CarTax implements Taxable{
    @Override
    public double getSimpleTaxRate() {
        return 0;
    }

    @Override
    public double getMiddleTaxRate() {
        return 0;
    }

    @Override
    public double getUpperTaxRate() {
        return 0;
    }
}
