package src.case_study.furama_resort.models;

public class Contract {
    private String idContract;
    private String idBooking;
    private int deposits;
    private int totalMoney;
    private String idCustomer;

    public Contract() {
    }

    public Contract(String idContract, String idBooking, int deposits, int totalMoney, String idCustomer) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.deposits = deposits;
        this.totalMoney = totalMoney;
        this.idCustomer = idCustomer;
    }
}
