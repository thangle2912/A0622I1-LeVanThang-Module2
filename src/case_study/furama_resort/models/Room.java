package src.case_study.furama_resort.models;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String name, float area, float rentalCost, int numberPeoples, String rentalType, String freeService) {
        super(name, area, rentalCost, numberPeoples, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
