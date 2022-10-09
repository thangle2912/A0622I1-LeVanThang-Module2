package src.ss12_map_tree.bai_tap.practice_arraylist_linkedlist;

public class Product implements Comparable<Product>{
    private int id;
    private String name;
    private float price;

    public Product() {
    }

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void printProduct(){
        System.out.printf("%10s %30s %20s", "Product ID", "NAME", "PRICE");
        System.out.println();
        System.out.format("%10s %30s %20s",
               this.id, this.name, this.price);
        System.out.println();
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return (int) ( this.price - o.price );
    }
}
