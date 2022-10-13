package src.case_study.furama_resort.models;

public abstract class Facility {
    private String name;
    private float area;
    private float rentalCost;
    private int numberPeoples;
    private String rentalType;

    public Facility() {
    }

    public Facility(String name, float area, float rentalCost, int numberPeoples, String rentalType) {
        this.name = name;
        this.area = area;
        this.rentalCost = rentalCost;
        this.numberPeoples = numberPeoples;
        this.rentalType = rentalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(float rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getNumberPeoples() {
        return numberPeoples;
    }

    public void setNumberPeoples(int numberPeoples) {
        this.numberPeoples = numberPeoples;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
}
