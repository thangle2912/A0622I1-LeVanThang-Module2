package src.ss5_access_modifier_staric.bai_tap.access_modifier;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String toString(){
        String mess= this.name+" : "+this.classes;
        return mess;
    }
}
