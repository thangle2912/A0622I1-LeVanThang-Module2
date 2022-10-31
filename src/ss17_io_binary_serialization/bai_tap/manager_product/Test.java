package src.ss17_io_binary_serialization.bai_tap.manager_product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        String url = "src\\ss17_io_binary_serialization\\bai_tap\\manager_product\\product.csv";
        System.out.println("-------------Manager Product ----------------");
        mainManage(products,url,scanner);

    }

    public static void mainManage(List<Product> products, String url, Scanner scanner) {
        System.out.println("1. Add Product");
        System.out.println("2. Display List");
        System.out.println("3. Search Product");
        System.out.println("4. Exit");
        System.out.println("--------------------------------");
        getChoice(products, url, scanner);
    }

    public static void getChoice(List<Product> products, String url, Scanner scanner) {
        System.out.printf("Input Your Choice : ");
        try {
            int yourChoice = Integer.parseInt(scanner.nextLine());
            switch (yourChoice) {
                case 1:
                    addProduct(products,url,scanner);
                    mainManage(products,url,scanner);
                    break;
                case 2:
                    displayProducts(url);
                    mainManage(products,url,scanner);
                    break;
                case 3:
                    String mess =searchProduct(url,scanner);
                    System.out.println(mess);
                    mainManage(products,url,scanner);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Choice Again !");
                    mainManage(products,url,scanner);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addProduct(List<Product> products, String url, Scanner scanner) {
        try {
            System.out.println("New Product !");
            System.out.printf("ID : ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.printf("Name : ");
            String name = scanner.nextLine();
            System.out.printf("Manufacturer : ");
            String manufacturer = scanner.nextLine();
            System.out.printf("Price : ");
            float price = Float.parseFloat(scanner.nextLine());
            System.out.printf("Description : ");
            String description = scanner.nextLine();
            products.add(new Product(id,name,manufacturer,price,description));
            FileUtils.writeFile(products, url);
            System.out.println("Add Success");
        }catch (Exception e){
            System.out.println("Add Fail");
            e.printStackTrace();
        }
    }
    public static void displayProducts( String url){
        List<Product> products1 = FileUtils.readFile(url);
        products1.forEach(System.out::println);
    }
    public static String searchProduct( String url, Scanner scanner){
        try {
            System.out.printf("Input Id Search : ");
            int inputId = Integer.parseInt(scanner.nextLine());
            List<Product> products = FileUtils.readFile(url);
            for (Product product: products){
                if (product.getId() == inputId){
                    return product.toString();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Not Found";
    }
}
