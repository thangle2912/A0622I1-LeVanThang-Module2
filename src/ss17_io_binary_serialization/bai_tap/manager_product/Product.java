package src.ss17_io_binary_serialization.bai_tap.manager_product;

import java.io.Serializable;

public class Product implements Serializable  {
    private final static long serialVersionUID =2912;
    private int id;
    private String name;
    private String manufacturer;
    private float price;
    private String description;

    public Product() {
    }

    public Product(int id, String name, String manufacturer, float price, String description) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.description = description;
    }

    public Product(String str){
         String [] data = str.split(",");
         this.id = Integer.parseInt(data[0]);
         this.name = data[1];
         this.manufacturer = data[2];
         this.price = Float.parseFloat(data[3]);
         this.description = data[4];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
    public String getInfo(){
        return this.id+ ","+this.name+","+this.manufacturer+""+this.price+","+this.description;
    }

}
