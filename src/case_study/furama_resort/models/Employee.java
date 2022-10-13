package src.case_study.furama_resort.models;

public class Employee extends Person {
    private String degree;
    private String positions;
    private float salary;

    public Employee() {
    }

    @Override
    public void print() {
//        System.out.printf("%10s %30s %20s ", "Product ID", "NAME", "PRICE");
//        System.out.println();
        System.out.format("%10s %20s %10s %20s %20s %20s %20s %20s %20s %20s",
                this.getId(),
                this.getName(),
                this.getGender(),
                this.getAge(),
                this.getCmnd(),
                this.getPhoneNumber(),
                this.getEmail(),
                this.degree,
                this.positions,
                this.salary);
        System.out.println();
    }

    public Employee(int id,
                    String name,
                    int age,
                    String gender,
                    String cmnd,
                    String phoneNumber,
                    String email,
                    String degree,
                    String positions,
                    float salary) {
        super(id, name, age, gender, cmnd, phoneNumber, email);
        this.degree = degree;
        this.positions = positions;
        this.salary = salary;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPositions() {
        return positions;
    }

    public void setPositions(String positions) {
        this.positions = positions;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setEmployee(String name, int age, String gender, String cmnd, String phoneNumber, String email, String degree, String positions, float salary){
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setCmnd(cmnd);
        this.setPhoneNumber(phoneNumber);
        this.setEmail(email);
        this.setDegree(degree);
        this.setPositions(positions);
        this.setSalary(salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "degree='" + degree + '\'' +
                ", positions='" + positions + '\'' +
                ", salary=" + salary +
                '}';
    }
}
