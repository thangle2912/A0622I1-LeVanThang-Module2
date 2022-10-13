package src.case_study.furama_resort.models;

public class House extends Facility {
    private String standardRooms;
    private int numberFloor;

    public House() {
    }

    public House(String standardRooms, int numberFloor) {
        this.standardRooms = standardRooms;
        this.numberFloor = numberFloor;
    }

    public House(String name, float area, float rentalCost, int numberPeoples, String rentalType, String standardRooms, int numberFloor) {
        super(name, area, rentalCost, numberPeoples, rentalType);
        this.standardRooms = standardRooms;
        this.numberFloor = numberFloor;
    }

    public String getStandardRooms() {
        return standardRooms;
    }

    public void setStandardRooms(String standardRooms) {
        this.standardRooms = standardRooms;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }
}
