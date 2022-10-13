package src.case_study.furama_resort.models;

public class Customer extends Person{
    private String customerType;
    private String address;

    public Customer() {
    }

    @Override
    void print() {

    }

    public Customer(int id,
                    String name,
                    int age,
                    String gender,
                    String cmnd,
                    String phoneNumber,
                    String email,
                    String customerType,
                    String address) {
        super(id, name, age, gender, cmnd, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
