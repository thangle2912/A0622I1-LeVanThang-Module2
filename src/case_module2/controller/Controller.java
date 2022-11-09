package src.case_module2.controller;

import src.case_module2.service.PhuongTienService;


import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------Quản lý phương tiện giao thông----------");
        displayMainMenu(scanner);
    }

    public static void displayMainMenu(Scanner scanner) {
        System.out.println("1. Đăng ký phương tiện");
        System.out.println("2. Xem dang sách đăng ký phương tiện");
        System.out.println("3. Huỷ đăng ký phương tiện");
        System.out.println("4. Thoát");
        getMainMenu(scanner);
    }

    public static void getMainMenu(Scanner scanner) {
        PhuongTienService phuongTienService = new PhuongTienService();
        System.out.printf("Nhập lựa chọn : ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                phuongTienService.dangKy();
                displayMainMenu(scanner);
                break;
            case 2:
                phuongTienService.display();
                displayMainMenu(scanner);
                System.out.print("tt");
                break;
//            case 3:
//                accountService.searchAccount();
//                displayMainMenu(scanner);
//                break;
////            case 4:
////                displayBookingManagement(scanner);
////                break;
//            case 5:
//                accountService.saveAccountData();
//                displayMainMenu(scanner);
//                break;
////            case 6:
////                displayPromotionManagement(scanner);
////                break;
//            case 7:
//                System.out.println("Exit");
//                break;
            default:
                System.out.println("Choice again !");
                displayMainMenu(scanner);
                break;

        }
    }


}
