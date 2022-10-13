package src.case_study.furama_resort.models;

public class Villa extends Facility{
    private String standardRooms;
    private float areaPool;
    private int numberFloor;

    public Villa() {
    }

    public Villa(String standardRooms, float areaPool, int numberFloor) {
        this.standardRooms = standardRooms;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }

    public Villa(String name, float area, float rentalCost, int numberPeoples, String rentalType, String standardRooms, float areaPool, int numberFloor) {
        super(name, area, rentalCost, numberPeoples, rentalType);
        this.standardRooms = standardRooms;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }

    public String getStandardRooms() {
        return standardRooms;
    }

    public void setStandardRooms(String standardRooms) {
        this.standardRooms = standardRooms;
    }

    public float getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(float areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }
}
