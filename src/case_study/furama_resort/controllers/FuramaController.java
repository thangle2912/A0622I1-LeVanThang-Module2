package src.case_study.furama_resort.controllers;

import src.case_study.furama_resort.services.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayMainMenu( scanner);
    }

    public static void displayMainMenu(Scanner scanner) {
        System.out.println("---------Fumara Resort----------");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
        getMainMenu(scanner);
    }

    public static void getMainMenu(Scanner scanner) {
        System.out.printf("Input your choice : ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                displayEmployeeManagement(scanner);
                break;
            case 2:
                displayCustomerManagement(scanner);
                break;
            case 3:
                displayFacilityManagement(scanner);
                break;
            case 4:
                displayBookingManagement(scanner);
                break;
            case 5:
                displayPromotionManagement(scanner);
                break;
            case 6:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Choice again !");
                displayMainMenu(scanner);
                break;

        }
    }

    public static void displayEmployeeManagement(Scanner scanner) {
        System.out.println("---------Employee Management----------");
        System.out.println("1. Display list employee");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Return main menu");
        getEmployeeManagement(scanner);
    }

    public static void getEmployeeManagement(Scanner scanner) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

        System.out.printf("Input your choice : ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                employeeService.display();
                displayEmployeeManagement(scanner);
                break;
            case 2:
                while(employeeService.addNew().equals("Id already exists")){
                    System.out.println("Id already exists ! Input Again :");
                }
                displayEmployeeManagement(scanner);
                break;
            case 3:
                while (employeeService.edit().equals("Index not found")){
                    System.out.println("Index not found ");
                }
                System.out.println(employeeService.edit());
                displayEmployeeManagement(scanner);
                break;
            case 4:
                System.out.println("Back");
                displayMainMenu(scanner);
                break;
            default:
                System.out.println("Choice again !");
                displayEmployeeManagement(scanner);
                break;
        }
    }

    public static void displayCustomerManagement(Scanner scanner) {
        System.out.println("---------Customer Management----------");
        System.out.println("1. Display list customer");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Return main menu");
        getCustomerManagement(scanner);
    }

    public static void getCustomerManagement(Scanner scanner) {
        System.out.println("Input your choice : ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("case 1");
                displayMainMenu(scanner);
                break;
            case 2:
                System.out.println("case 2");
                displayMainMenu(scanner);
                break;
            case 3:
                System.out.println("case 3");
                displayMainMenu(scanner);
                break;
            case 4:
                System.out.println("Back");
                displayMainMenu(scanner);
                break;
            default:
                System.out.println("Choice again !");
                displayCustomerManagement(scanner);
                break;
        }
    }

    public static void displayFacilityManagement(Scanner scanner) {
        System.out.println("---------Facility Management----------");
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Edit list facility maintenance");
        System.out.println("4. Return main menu");
        getFacilityManagement(scanner);
    }

    public static void getFacilityManagement(Scanner scanner) {
        System.out.println("Input your choice : ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("case 1");
                displayMainMenu(scanner);
                break;
            case 2:
                System.out.println("case 2");
                displayMainMenu(scanner);
                break;
            case 3:
                System.out.println("case 3");
                displayMainMenu(scanner);
                break;
            case 4:
                System.out.println("Back");
                displayMainMenu(scanner);
                break;
            default:
                System.out.println("Choice again !");
                displayFacilityManagement(scanner);
                break;
        }
    }

    public static void displayBookingManagement(Scanner scanner) {
        System.out.println("---------Booking Management----------");
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new contract");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
        getBookingManagement(scanner);
    }

    public static void getBookingManagement(Scanner scanner) {
        System.out.println("Input your choice : ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("case 1");
                displayMainMenu(scanner);
                break;
            case 2:
                System.out.println("case 2");
                displayMainMenu(scanner);
                break;
            case 3:
                System.out.println("case 3");
                displayMainMenu(scanner);
                break;
            case 4:
                System.out.println("Back");
                displayMainMenu(scanner);
                break;
            default:
                System.out.println("Choice again !");
                displayBookingManagement(scanner);
                break;
        }
    }

    public static void displayPromotionManagement(Scanner scanner) {
        System.out.println("---------Promotion Management----------");
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get voucher");
        System.out.println("3. Return main menu");
        getPromotionManagement(scanner);
    }

    public static void getPromotionManagement(Scanner scanner) {
        System.out.println("Input your choice : ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("case 1");
                displayMainMenu(scanner);
                break;
            case 2:
                System.out.println("case 2");
                displayMainMenu(scanner);
                break;
            case 3:
                System.out.println("case 3");
                displayMainMenu(scanner);
                break;
            case 4:
                System.out.println("Back");
                displayMainMenu(scanner);
                break;
            default:
                System.out.println("Choice again !");
                displayPromotionManagement(scanner);
                break;
        }
    }
}
