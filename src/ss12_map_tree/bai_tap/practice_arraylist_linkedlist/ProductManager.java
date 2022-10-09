package src.ss12_map_tree.bai_tap.practice_arraylist_linkedlist;

import java.util.*;

public class ProductManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> arrayList = new ArrayList<>();
        System.out.println("Product Manager ");
        mainManager(arrayList, scanner);
    }

    public static void mainManager(ArrayList<Product> productArrayList, Scanner scanner) {
        System.out.println(
                "1. Add Product" +
                        "   ||  2. Update Product" +
                        "   ||  3. Delete Product" +
                        "   ||  4. Display Product" +
                        "   ||  5. Search Product" +
                        "   ||  6. Sort Product" +
                        "   ||  7. Exit"
        );
        System.out.printf("Choice option :");
        int yourChoice = Integer.parseInt(scanner.nextLine());
        switch (yourChoice) {
            case 1:
                addProduct(productArrayList, scanner);
                mainManager(productArrayList, scanner);
                break;
            case 2:
                updateProduct(productArrayList, scanner);
                mainManager(productArrayList, scanner);
                break;
            case 3:
                removeProduct(productArrayList, scanner);
                mainManager(productArrayList, scanner);
                break;
            case 4:
                displayProductList(productArrayList);
                mainManager(productArrayList, scanner);
                break;
            case 5:
                searchProduct(productArrayList, scanner);
                mainManager(productArrayList, scanner);
                break;
            case 6:
                sortProduct(productArrayList);
                mainManager(productArrayList, scanner);
                break;
            case 7:
                System.out.println("Exit !");
                break;
            default:
                System.out.println("-------------   Error   ---------------");
                mainManager(productArrayList, scanner);
                break;
        }
    }

    public static void updateProduct(ArrayList<Product> arrayList, Scanner scanner) {
        System.out.println("Input Id Product :");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : arrayList) {
            if (product.getId() == id) {
                System.out.println("Current Product ");
                product.printProduct();
                System.out.printf("New Name :");
                String newName = scanner.nextLine();
                product.setName(newName);
                System.out.printf("New Price :");
                float newPrice = Float.parseFloat(scanner.nextLine());
                product.setPrice(newPrice);
                displayProductList(arrayList);
                return;
            }
        }
        System.out.println("Id Invalid");

    }

    public static void addProduct(ArrayList<Product> arrayList, Scanner scanner) {
        System.out.println("Input new Product :");
        System.out.printf("ID :");

        int id = Integer.parseInt(scanner.nextLine());
        for (Product product1 : arrayList) {
            if (product1.getId() == id) {
                return;
            }
        }
        System.out.printf("Name :");
        String nameProduct = scanner.nextLine();
        System.out.printf("Price :");
        float price = Float.parseFloat(scanner.nextLine());
        Product product = new Product(id, nameProduct, price);
        arrayList.add(product);
    }

    public static void removeProduct(ArrayList<Product> arrayList, Scanner scanner) {
        System.out.println("Input Id Product remove :");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : arrayList) {
            if (product.getId() == id) {
                arrayList.remove(product);
                return;
            }
        }
        System.out.println("Id Invalid");
    }

    public static void displayProductList(ArrayList<Product> arrayList) {
        if (!arrayList.isEmpty()) {
            System.out.printf("%10s %30s %20s", "Product ID", "NAME", "PRICE");
            System.out.println();
            for (Product product : arrayList) {
                System.out.format("%10s %30s %20s",
                        product.getId(), product.getName(), product.getPrice());
                System.out.println();

            }
        } else {
            System.out.println("No Product ! ");
        }

    }

    public static void searchProduct(ArrayList<Product> arrayList, Scanner scanner) {
        System.out.println("Input name Product search :");
        String nameProduct = scanner.nextLine().toLowerCase();
        for (Product product : arrayList) {
            if (product.getName().toLowerCase().equals(nameProduct)) {
                product.printProduct();
                return;
            }
        }
        System.out.println("Name Invalid");
    }
    public static void sortProduct(ArrayList<Product> arrayList) {
        Collections.sort(arrayList);
        System.out.println("Product List after sort");
        displayProductList(arrayList);
    }

}
